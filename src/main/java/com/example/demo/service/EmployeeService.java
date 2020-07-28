package com.example.demo.service;

import com.example.demo.entity.Employee;

import java.util.List;

public interface EmployeeService {
    void addEmployee(Employee employee);

    Employee findEmployeeById(int employeeId);

    Employee updateEmployee(Employee employee);

    List<Employee> findAllEmployees();

    void deleteEmployeeById(int employeeId);

}
