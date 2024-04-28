package com.mak.config;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * The {@code ConfigServerApplication} class is the main entry point for the Config Server application.
 * It is annotated with {@code @EnableConfigServer} to enable the Config Server functionality.
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {
    /**
     * The {@code main} method to start the ServiceOne application.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }
}
