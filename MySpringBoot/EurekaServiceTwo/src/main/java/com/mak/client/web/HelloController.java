package com.mak.client.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ServiceTwo")
public class HelloController {

    @GetMapping("hello")
    public String sayHello() {
        return "<h2><i>Service <font color=\"blue\">Two</font></i></h2>";
    }
}
