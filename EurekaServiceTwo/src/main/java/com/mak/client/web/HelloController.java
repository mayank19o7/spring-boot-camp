package com.mak.client.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller class for handling HTTP requests related to the "ServiceTwo" service.
 */
@RestController
@RequestMapping("ServiceTwo")
public class HelloController {

    /**
     * Handles GET requests to the "/hello" endpoint.
     *
     * @return An HTML string with a greeting message for ServiceTwo.
     */
    @GetMapping("hello")
    public String sayHello() {
        return "<h2><i>Service <font color=\"blue\">Two</font></i></h2>";
    }
}
