package com.mak.client.service;

import com.mak.client.domain.Department;

/**
 * Interface for a service that manages department-related operations.
 */
public interface IDepartmentService {

    /**
     * Retrieves a department by its ID.
     *
     * @param id The ID of the department to retrieve.
     * @return The department with the given ID, or null if not found.
     */
    Department getDepartment(Long id);
}
