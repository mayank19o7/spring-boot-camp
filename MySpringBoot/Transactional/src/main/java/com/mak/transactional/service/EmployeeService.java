package com.mak.transactional.service;

import com.mak.transactional.domain.Department;
import com.mak.transactional.domain.Employee;
import com.mak.transactional.repository.DepartmentRepository;
import com.mak.transactional.repository.EmployeeRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    DepartmentRepository departmentRepository;

    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    public Optional<Employee> getEmployeeById(long id) {
        return employeeRepository.findById(id);
    }

    @Transactional
    public Employee saveEmployee(Employee employee) {
        Department department = new Department();
        department.setName(employee.getDepartment());
        department.setCode(employee.getDepartmentCode());

        departmentRepository.save(department);

        // If @Transactional is used.
        // Below code crashes and the whole transaction is rolled back (i.e. department is also not saved).
        employee = null;
        employee.setName("Test");

        return employeeRepository.save(employee);
    }
}
