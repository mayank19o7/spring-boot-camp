package com.mak.client.service;

import com.mak.client.domain.Department;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service class for managing department-related operations.
 */
@Service
public class DepartmentService implements IDepartmentService {

    /**
     * List of pre-defined departments for demonstration purposes.
     */
    List<Department> departments = List.of(
            new Department(101L, "Dept A"),
            new Department(102L, "Dept B"),
            new Department(103L, "Dept C")
    );

    /**
     * Retrieves a department by its ID.
     *
     * @param id The ID of the department to retrieve.
     * @return The department with the given ID, or null if not found.
     */
    @Override
    public Department getDepartment(Long id) {
        return departments.stream().filter(department -> department.getId().equals(id)).findAny().get();
    }
}
