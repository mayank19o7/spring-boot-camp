package com.mak.client.web;

import com.mak.client.domain.Employee;
import com.mak.client.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Controller class for managing department resources.
 */
@RestController
@RequestMapping("employees")
public class EmployeeController {

    @Autowired
    IEmployeeService employeeService;

    /**
     * Retrieves a list of employees by department ID.
     *
     * @param id The ID of the department for which to retrieve employees.
     * @return A list of employees belonging to the department with the given ID.
     */
    @GetMapping("{id}")
    public List<Employee> getEmployeesByDepartmentId(@PathVariable("id") Long id) {
        return employeeService.getEmployees(id);
    }
}
