package com.mak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

/**
 * The main class for Spring Boot Application.
 * <p>
 * This class uses the {@code @EnableZipkinServer} annotation to enable the Zipkin Server functionality.
 */
@SpringBootApplication
@EnableZipkinServer
public class ZipkinApplication {
    /**
     * The {@code main} method to start the Spring Boot application.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(ZipkinApplication.class, args);
    }
}
