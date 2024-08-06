package com.developer.employee_management.controller;

import com.developer.employee_management.entity.EmployeeEntity;
import com.developer.employee_management.repository.EmployeeRepository;
import com.developer.employee_management.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    public  EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<EmployeeEntity> findAllEmployee(){
        return employeeService.findAllEmployee();
    }

    @GetMapping("/id")
    public Optional<EmployeeRepository> findEmployeeById(@PathVariable("id") long id){
        return employeeService.findById(id);
    }

    @GetMapping
    public EmployeeEntity saveEmployee(@RequestBody EmployeeEntity employeeEntity){
        return employeeService.saveEmployee(EmployeeEntity);
    }

    @GetMapping
    public  EmployeeEntity updateEmployee(@RequestBody EmployeeEntity employeeEntity){
        return employeeService.updateEmployee(employeeEntity);
    }
}
