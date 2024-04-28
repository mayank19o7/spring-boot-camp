package com.mak.client.domain;

import lombok.Data;

@Data
public class Employee {

    private Long id;
    private String name;
    private Long departmentId;

    public Employee(String name, Long departmentId, Long id) {
        this.name = name;
        this.departmentId = departmentId;
        this.id = id;
    }
}
