package com.mak.client.service;

import com.mak.client.domain.Employee;

import java.util.List;

/**
 * Interface for a service that manages employee-related operations.
 */
public interface IEmployeeService {

    /**
     * Retrieves a list of employees by department ID.
     *
     * @param departmentId The ID of the department for which to retrieve employees.
     * @return A list of employees belonging to the department with the given ID.
     */
    List<Employee> getEmployees(Long departmentId);
}
