package com.mak.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The main class for Spring Boot Application.
 */
@SpringBootApplication
public class SecureApplication {
    /**
     * The {@code main} method to start the Spring Boot application.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(SecureApplication.class, args);
    }
}
