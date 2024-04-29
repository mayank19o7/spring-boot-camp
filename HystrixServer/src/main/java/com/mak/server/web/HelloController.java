package com.mak.server.web;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Controller class for handling hello requests.
 */
@RestController
public class HelloController {

    @Autowired
    RestTemplate restTemplate;

    /**
     * Handles GET requests for "/hello" endpoint.
     *
     * @return a simple HTML greeting message
     */
    @GetMapping("hello")
    public String hello() {
        return "<h2>Hello</h2>";
    }

    /**
     * Handles GET requests for "/first" endpoint.
     *
     * @return a concatenated string of responses from two different services
     */
    @GetMapping("first")
    public String first() {
        String first = restTemplate.getForObject("http://localhost:9002/ServiceOne/hello", String.class);
        String second = restTemplate.getForObject("http://localhost:9003/ServiceTwo/hello", String.class);
        return first + " " + second;
    }

    /**
     * Handles GET requests for "/second" endpoint.
     * Uses {@code @HystrixCommand} annotation with a fallback method.
     *
     * @return a concatenated string of responses from two different services
     */
    @HystrixCommand(fallbackMethod = "myFallBackMethod")
    @GetMapping("second")
    public String second() {
        String first = restTemplate.getForObject("http://localhost:9002/ServiceOne/hello", String.class);
        String second = restTemplate.getForObject("http://localhost:9003/ServiceTwo/hello", String.class);
        return first + " " + second;
    }

    /**
     * Handles GET requests for "/third" endpoint.
     * Uses {@code @HystrixCommand} annotation with a fallback method and a timeout setting.
     * <p>
     * we used execution.isolation.thread.timeoutInMilliseconds
     * attribute with value 1000 means the RestTemplate will wait for 1000 ms
     * and once this time is over than it perform fallback logic where it executes the fallback method.
     *
     * @return a concatenated string of responses from two different services
     * @throws InterruptedException if the thread is interrupted while sleeping
     */
    @HystrixCommand(fallbackMethod = "myFallBackMethod", commandProperties = {@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1000")})
    @GetMapping("/third")
    public String third() throws InterruptedException {
        String first = restTemplate.getForObject("http://localhost:9002/ServiceOne/hello", String.class);
        Thread.sleep(2000);
        String second = restTemplate.getForObject("http://localhost:9003/ServiceTwo/hello", String.class);
        return first + " " + second;
    }

    /**
     * Fallback method called by Hystrix if the main method fails.
     *
     * @return a simple HTML message indicating a fallback response
     */
    public String myFallBackMethod() {
        return "<h2>Hello User, please come back in 10 minutes</h2>";
    }
}