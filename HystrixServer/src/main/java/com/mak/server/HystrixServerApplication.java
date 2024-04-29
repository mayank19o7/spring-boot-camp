package com.mak.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * The main class for Spring Boot Application.
 * <p>
 * It is annotated with {@code @EnableHystrix} to enable hystrix for this application.
 */
@SpringBootApplication
@EnableHystrix
public class HystrixServerApplication {
    /**
     * The {@code main} method to start the Spring Boot application.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(HystrixServerApplication.class, args);
    }

    /**
     * Bean definition for RestTemplate.
     *
     * @return a new instance of RestTemplate
     */
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
