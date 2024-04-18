package com.mak.client.controller;

import com.mak.client.domain.Department;
import com.mak.client.domain.Employee;
import com.mak.client.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@RestController
@RequestMapping("departments")
public class DepartmentController {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    IDepartmentService departmentService;

    @GetMapping("{id}")
    public Department getDepartment(@PathVariable("id") Long id) {
        Department department = departmentService.getDepartment(id);

        Employee[] employees = restTemplate.getForObject("http://employee-service/employees/" + id, Employee[].class);
        department.setEmployees(Arrays.asList(employees));
        return department;
    }
}
