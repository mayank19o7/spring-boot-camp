package com.mak.resilience.domain;

import lombok.Data;

@Data
public class Order {

    private Long id;
    private String name;
    private String category;
    private String color;
    private Double price;

    public Order(Long id, String name, String category, String color, Double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.color = color;
        this.price = price;
    }
}
