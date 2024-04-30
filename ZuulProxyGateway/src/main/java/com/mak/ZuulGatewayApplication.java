package com.mak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * The main class for Spring Boot Application.
 * <p>
 * This class uses the {@code @EnableZuulProxy} annotation to enable the Zuul Proxy functionality.
 */
@SpringBootApplication
@EnableZuulProxy
public class ZuulGatewayApplication {
    /**
     * The {@code main} method to start the Spring Boot application.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(ZuulGatewayApplication.class, args);
    }
}
