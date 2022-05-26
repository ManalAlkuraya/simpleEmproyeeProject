package com.example.taskone.controller;

import com.example.taskone.model.entities.Employee;
import com.example.taskone.model.services.EmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path="Employee")
public class EmployeeController {
    private EmployeeServices employeeServices;

    @Autowired

    public EmployeeController(EmployeeServices employeeServices) {
        this.employeeServices = employeeServices;
    }
    @GetMapping
    public List<Employee> getEmployee(){
        return employeeServices.getEmployee();
    }
    @GetMapping(path="{id}")
    public Optional<Employee> getEmployee(@PathVariable(name="id") Long id){
        return employeeServices.getEmployee(id);
    }
    @PostMapping("add")
    public void newEmployee(@RequestBody Employee employee){
        employeeServices.addNewEmployee(employee);
    }
    @DeleteMapping(path="delete/{id}")
    public void deleteEmployee(@PathVariable("id") Long id){
        employeeServices.deleteEmployee(id);
    }

}
