package com.mak.client.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller class for handling HTTP requests related to the "ServiceOne" service.
 */
@RestController
@RequestMapping("ServiceOne")
public class HelloController {

    /**
     * Handles GET requests to the "/hello" endpoint.
     *
     * @return An HTML string with a greeting message for ServiceOne.
     */
    @GetMapping("hello")
    public String sayHello() {
        return "<h2><i>Service <font color=\"red\">One</font></i></h2>";
    }
}
