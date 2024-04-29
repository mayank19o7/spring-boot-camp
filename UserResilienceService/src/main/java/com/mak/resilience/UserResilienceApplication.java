package com.mak.resilience;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * The main class for Spring Boot Application.
 */
@SpringBootApplication
public class UserResilienceApplication {
    /**
     * The {@code main} method to start the Spring Boot application.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(UserResilienceApplication.class, args);
    }

    /**
     * Bean definition for RestTemplate.
     *
     * @return a new instance of RestTemplate
     */
    @Bean
    RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
