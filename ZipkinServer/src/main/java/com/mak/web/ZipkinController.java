package com.mak.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class ZipkinController {

    @GetMapping
    public String hello() {
        return "hello";
    }
}
