package com.mak.client.service;

import com.mak.client.domain.Employee;

import java.util.List;

public interface IEmployeeService {

    List<Employee> getEmployees(Long DepartmentId);
}
