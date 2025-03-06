package com.example.springboot.employees_service.service;
import com.example.springboot.employees_service.dao.EmployeeRepository;
import com.example.springboot.employees_service.entity.Employee;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository)
    {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAll()
    {
        return employeeRepository.findAll();
    }

    @Override
    public Optional<Employee> findById(int id) {
        return Optional.ofNullable(employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Did not find employee id - " + id)));
    }


    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteById(int id) {
        employeeRepository.deleteById(id);
    }

}
