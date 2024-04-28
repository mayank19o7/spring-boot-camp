package com.mak.resilience.web;

import com.mak.resilience.domain.Order;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("orders")
    @CircuitBreaker(name = "userService", fallbackMethod = "getAllOrders")
    public List<Order> getOrders() {
        return restTemplate.getForObject("http://localhost:9001/orders", List.class);
    }

    public List<Order> getAllOrders(Exception exception) {
        return Arrays.asList(
                new Order(101L, "Order A", "A", "white", 1000.0),
                new Order(102L, "Order B", "A", "grey", 2000.0),
                new Order(103L, "Order C", "B", "black", 1250.0)
        );
    }
}
