package com.mak.order.web;

import com.mak.order.domain.Order;
import com.mak.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Controller for managing orders.
 */
@RestController
@RequestMapping("orders")
public class OrderController {

    @Autowired
    OrderService orderService;

    /**
     * Retrieve all orders.
     *
     * @return a list of all orders
     */
    @GetMapping
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }

    /**
     * Retrieve orders by category.
     *
     * @param category the category to filter orders by
     * @return a list of orders in the specified category
     */
    @GetMapping("{category}")
    public List<Order> getOrders(@PathVariable String category) {
        return orderService.getOrders(category);
    }
}
