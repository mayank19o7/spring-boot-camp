package com.mak.security.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("login")
public class LoginController {
    //Can be accessed by Ninja
    @PostMapping("/admin")
    public String saveAdmin() {
        return "admin saved";
    }

    //Can be accessed by Ninja
    @GetMapping("/admin")
    public String getAdmin() {
        return "admin is sent back";
    }

    //Can be accessed by Ninja
    @PostMapping("/user")
    public String saveUser() {
        return "user saved";
    }

    //Can be accessed by Ninja
    //Can be accessed by Pheonix
    @GetMapping("/user")
    public String getUser() {
        return "user is sent back";
    }
}
