package com.mak.client.service;

import com.mak.client.domain.Department;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService implements IDepartmentService {

    List<Department> departments = List.of(
            new Department(101L, "Dept A"),
            new Department(102L, "Dept B"),
            new Department(103L, "Dept C")
    );

    @Override
    public Department getDepartment(Long id) {
        return departments.stream().filter(department -> department.getId().equals(id)).findAny().get();
    }
}
