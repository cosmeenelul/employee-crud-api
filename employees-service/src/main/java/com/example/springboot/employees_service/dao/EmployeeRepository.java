package com.example.springboot.employees_service.dao;

import com.example.springboot.employees_service.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
