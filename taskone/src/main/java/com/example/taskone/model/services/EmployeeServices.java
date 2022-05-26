package com.example.taskone.model.services;

import com.example.taskone.model.entities.Employee;
import com.example.taskone.model.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServices {
    private EmployeeRepo employeeRepo;
    @Autowired

    public EmployeeServices(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }
    public List<Employee> getEmployee(){
        return employeeRepo.findAll();
    }
    public Optional<Employee> getEmployee(Long id){
        return employeeRepo.findById(id);
    }
    public void deleteEmployee(Long id){
        employeeRepo.deleteById(id);
    }
    public void addNewEmployee(Employee employee){
        employeeRepo.save(employee);
    }
}
