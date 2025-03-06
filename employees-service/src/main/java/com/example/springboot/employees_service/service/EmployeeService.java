package com.example.springboot.employees_service.service;

import com.example.springboot.employees_service.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    List<Employee> findAll();

    Optional<Employee> findById(int id);

    Employee save(Employee employee);

    void deleteById(int id);
}
