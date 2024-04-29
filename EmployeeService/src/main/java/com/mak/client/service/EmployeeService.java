package com.mak.client.service;

import com.mak.client.domain.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Service class for managing employee-related operations.
 */
@Service
public class EmployeeService implements IEmployeeService {

    /**
     * List of pre-defined employees for demonstration purposes.
     */
    List<Employee> employees = List.of(
            new Employee("Amit", 101L, 1101L),
            new Employee("Mayur", 101L, 1102L),
            new Employee("Danny", 102L, 1103L),
            new Employee("Laurent", 102L, 1104L),
            new Employee("Thibaut", 102L, 1105L),
            new Employee("Venkatesh", 103L, 1106L)
    );

    /**
     * Retrieves a list of employees by department ID.
     *
     * @param departmentId The ID of the department for which to retrieve employees.
     * @return A list of employees belonging to the department with the given ID.
     */
    @Override
    public List<Employee> getEmployees(Long departmentId) {
        return employees.stream().filter(employee -> employee.getDepartmentId().equals(departmentId)).collect(Collectors.toList());
    }
}
