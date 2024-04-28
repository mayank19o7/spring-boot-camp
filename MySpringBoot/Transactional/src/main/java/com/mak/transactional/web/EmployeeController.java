package com.mak.transactional.web;

import com.mak.transactional.domain.Employee;
import com.mak.transactional.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Controller class for managing employee resources.
 */
@RestController
@RequestMapping("employees")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    /**
     * Retrieves all employees.
     *
     * @return List of all employees.
     */
    @GetMapping("all")
    public List<Employee> fetchEmployees() {
        return employeeService.getEmployees();
    }

    /**
     * Retrieves an employee by ID.
     *
     * @param id The ID of the employee to retrieve.
     * @return Optional containing the employee if found, empty otherwise.
     */
    @GetMapping("{empId}")
    public Optional<Employee> getEmployee(@PathVariable("empId") long id) {
        return employeeService.getEmployeeById(id);
    }

    /**
     * Saves a new employee.
     *
     * @param employee The employee to save.
     * @return The saved employee.
     */
    @PostMapping
    public Employee saveEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }
}
