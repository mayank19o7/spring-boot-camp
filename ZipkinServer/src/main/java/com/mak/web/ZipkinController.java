package com.mak.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller for handling requests related to Zipkin.
 */
@RestController
@RequestMapping("hello")
public class ZipkinController {

    /**
     * Handles GET requests to the base URL and returns a simple greeting message.
     *
     * @return A greeting message.
     */
    @GetMapping
    public String hello() {
        return "hello";
    }
}
