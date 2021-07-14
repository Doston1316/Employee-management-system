package com.employeeSystem.service;

import com.employeeSystem.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee>getAllEmployee();

    Employee saveEmployee(Employee employee);

    Employee getEmployeeById(Long id);

    Employee UpdateEmployee(Employee employee);

    void deleteEmployee(Long id);

}
