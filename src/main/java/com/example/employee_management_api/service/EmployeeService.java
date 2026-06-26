package com.example.employee_management_api.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.example.employee_management_api.model.Employee;

@Service
public class EmployeeService {

    private List<Employee> employees = new ArrayList<>();

    // Constructor to mock initial data
    public EmployeeService() {
        employees.add(new Employee(1, "Senthur", "DevOps", 1500000));
        employees.add(new Employee(2, "Gagan deep", "Web development", 2500000));
    }

    // Method to return all employees
    public List<Employee> getAllEmployees() {
        return employees;
    }
}