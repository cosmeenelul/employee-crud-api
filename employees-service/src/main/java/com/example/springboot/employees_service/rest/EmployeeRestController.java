package com.example.springboot.employees_service.rest;

import com.example.springboot.employees_service.entity.Employee;
import com.example.springboot.employees_service.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/api")
@RestController
public class EmployeeRestController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeRestController(EmployeeService employeeService)
    {
        this.employeeService = employeeService;
    }
    // expose "/employees" and return a list of employees
    @GetMapping("/employees")
    public List<Employee> findAll()
    {
        return employeeService.findAll();
    }

    @GetMapping("/employees/{employeeId}")
    public Optional<Employee> getEmpoloyee(@PathVariable int employeeId)
    {

        Optional<Employee> employee = employeeService.findById(employeeId);
        if(employee == null)
        {
            throw new RuntimeException("Employee id not found -" + employeeId);
        }
        return employeeService.findById(employeeId);
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee)
    {
        return employeeService.save(employee);
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee)
    {
        return employeeService.save(employee);
    }

    @DeleteMapping("/employees/{employeeId}")
    public String deleteEmployee(@PathVariable int employeeId)
    {
        Optional<Employee> dbEmployee = employeeService.findById(employeeId);

        if(dbEmployee == null)
        {
            throw new RuntimeException("Employee id not found" + employeeId);
        }
        employeeService.deleteById(employeeId);

        return "Deleted employee id of " + employeeId;
    }
}
