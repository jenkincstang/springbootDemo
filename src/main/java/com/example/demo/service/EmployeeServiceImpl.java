package com.example.demo.service;

import com.example.demo.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    private List<Employee> employees = new ArrayList<>();

    @Override
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
    @Override
    public Employee findEmployeeById(int employeeId) {
        for (Employee employee : employees) {
            if (employee.getId() == employeeId) return employee;
        }
        return null;
    }
    @Override
    public Employee updateEmployee(Employee employee) {
        for (Employee emp : employees) {
            if (emp.getId() == employee.getId()){
                emp.setAge(employee.getAge());
                emp.setGender(employee.getGender());
                emp.setName(employee.getName());
                return emp;
            }
        }
        return null;
    }
    @Override
    public List<Employee> findAllEmployees() {
        return employees;
    }
    @Override
    public void deleteEmployeeById(int employeeId){
        Iterator<Employee> employeeIterator = employees.iterator();
        while(employeeIterator.hasNext()){
            Employee nextEmployee = employeeIterator.next();
            if(nextEmployee.getId() == employeeId)employeeIterator.remove();
        }
    }
}
