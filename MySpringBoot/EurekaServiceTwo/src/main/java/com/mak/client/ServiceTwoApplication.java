package com.mak.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * The main class for ServiceTwoApplication.
 * <p>
 * It is annotated with {@code @EnableDiscoveryClient} to enable service discovery for this application.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ServiceTwoApplication {
    /**
     * The {@code main} method to start the ServiceTwo application.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(ServiceTwoApplication.class, args);
    }
}
