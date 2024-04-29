package com.mak.order.service;


import com.mak.order.domain.Order;
import com.mak.order.repository.OrderRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * Service class for managing orders.
 */
@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    /**
     * Initializes some sample orders on service initialization.
     */
    @PostConstruct
    public void initOrders() {
        List<Order> orders = Arrays.asList(
                new Order(101L, "LED TV", "electronics", "white", 45000.0),
                new Order(102L, "Headset", "electronics", "black", 7000.0),
                new Order(103L, "Sound bar", "electronics", "black", 13000.0),
                new Order(104L, "Puma Shoes", "foot wear", "black & white", 4600.0),
                new Order(105L, "Vegetable chopper", "kitchen", "blue", 999.0),
                new Order(106L, "Oven Gloves", "kitchen", "grey", 745.0)
        );
        orderRepository.saveAll(orders);
    }

    /**
     * Retrieves orders by category.
     *
     * @param category The category of the orders to retrieve.
     * @return A list of orders matching the specified category.
     */
    public List<Order> getOrders(String category) {
        return orderRepository.findByCategory(category);
    }

    /**
     * Retrieves all orders.
     *
     * @return A list of all orders.
     */
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }
}
