package com.mak.server;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Main class for the Eureka Server registry application.
 * <p>
 * This class uses the {@code @EnableEurekaServer} annotation to enable the Eureka Server functionality.
 * The {@code main} method starts the Spring application context and runs the Eureka Server.
 * </p>
 *
 * @see org.springframework.cloud.netflix.eureka.server.EnableEurekaServer
 */
@SpringBootApplication
@EnableEurekaServer
public class RegistryServerApplication {
    /**
     * Entry point for the Eureka Server application.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(RegistryServerApplication.class, args);
    }
}
