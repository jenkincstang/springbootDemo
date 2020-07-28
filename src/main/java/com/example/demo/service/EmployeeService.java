package com.example.demo.service;

import com.example.demo.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class EmployeeService {
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public Employee findEmployeeById(int employeeId) {
        for (Employee employee : employees) {
            if (employee.getId() == employeeId) return employee;
        }
        return null;
    }

    public List<Employee> findAllEmployees() {
        return employees;
    }

    public void deleteEmployeeById(int employeeId){
        Iterator<Employee> employeeIterator = employees.iterator();
        while(employeeIterator.hasNext()){
            Employee nextEmployee = employeeIterator.next();
            if(nextEmployee.getId() == employeeId)employeeIterator.remove();
        }
    }
}
