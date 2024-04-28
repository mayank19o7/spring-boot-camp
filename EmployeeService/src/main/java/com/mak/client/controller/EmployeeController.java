package com.mak.client.controller;

import com.mak.client.domain.Employee;
import com.mak.client.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("employees")
public class EmployeeController {

    @Autowired
    IEmployeeService employeeService;

    @GetMapping("{id}")
    public List<Employee> getEmployeesByDepartmentId(@PathVariable("id") Long id) {
        return employeeService.getEmployees(id);
    }
}
