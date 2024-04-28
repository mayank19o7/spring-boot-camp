package com.mak.bookclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BookClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(BookClientApplication.class, args);
    }
}
