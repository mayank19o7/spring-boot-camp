package com.mak.transactional;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main class to start the Spring Boot application.
 */
@SpringBootApplication
public class TransactionalApplication {
    /**
     * Main method to start the Spring Boot application.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(TransactionalApplication.class, args);
    }
}
