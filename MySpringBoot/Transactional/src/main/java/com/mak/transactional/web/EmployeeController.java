package com.mak.transactional.web;

import com.mak.transactional.domain.Employee;
import com.mak.transactional.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("employees")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("all")
    public List<Employee> fetchEmployees() {
        return employeeService.getEmployees();
    }

    @GetMapping("{empId}")
    public Optional<Employee> getEmployee(@PathVariable("empId") long id) {
        return employeeService.getEmployeeById(id);
    }

    @PostMapping
    public Employee saveEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }
}
