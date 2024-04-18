package com.mak.server.web;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("hello")
    public String hello() {
        return "<h2>Hello</h2>";
    }

    @GetMapping("first")
    public String first() {
        String first = restTemplate.getForObject("http://localhost:9002/ServiceOne/hello", String.class);
        String second = restTemplate.getForObject("http://localhost:9003/ServiceTwo/hello", String.class);
        return first + " " + second;
    }

    @HystrixCommand(fallbackMethod = "myFallBackMethod")
    @GetMapping("second")
    public String second() {
        String first = restTemplate.getForObject("http://localhost:9002/ServiceOne/hello", String.class);
        String second = restTemplate.getForObject("http://localhost:9003/ServiceTwo/hello", String.class);
        return first + " " + second;
    }

    /**
     * we used execution.isolation.thread.timeoutInMilliseconds
     * attribute with value 1000 means the RestTemplate will wait for 1000 ms
     * and once this time is over than it perform fallback logic where it executes the fallback method.
     **/
    @HystrixCommand(fallbackMethod = "myFallBackMethod", commandProperties = {@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1000")})
    @GetMapping("/third")
    public String third() throws InterruptedException {
        String first = restTemplate.getForObject("http://localhost:9002/ServiceOne/hello", String.class);
        Thread.sleep(2000);
        String second = restTemplate.getForObject("http://localhost:9003/ServiceTwo/hello", String.class);
        return first + " " + second;
    }

    public String myFallBackMethod() {
        return "<h2>Hello User, please come back in 10 minutes</h2>";
    }
}