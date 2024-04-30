package com.mak.security.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller class for handling login-related requests.
 */
@RestController
@RequestMapping("login")
public class LoginController {
    /**
     * Saves an admin, can be accessed by Ninja.
     *
     * @return A message indicating that the admin is saved.
     */
    @PostMapping("/admin")
    public String saveAdmin() {
        return "admin saved";
    }

    /**
     * Retrieves the admin, can be accessed by Ninja
     *
     * @return A message indicating that the admin is sent back.
     */
    @GetMapping("/admin")
    public String getAdmin() {
        return "admin is sent back";
    }

    /**
     * Saves a user, can be accessed by Ninja
     *
     * @return A message indicating that the user is saved.
     */
    @PostMapping("/user")
    public String saveUser() {
        return "user saved";
    }

    /**
     * Retrieves the user, Can be accessed by Ninja and Pheonix both.
     *
     * @return A message indicating that the user is sent back.
     */
    @GetMapping("/user")
    public String getUser() {
        return "user is sent back";
    }
}
