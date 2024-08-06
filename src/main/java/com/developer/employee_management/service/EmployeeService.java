package com.developer.employee_management.service;

import  com.developer.employee_management.entity.EmployeeEntity;

import java.util.List;

public interface EmployeeService {
    List<EmployeeEntity> findAllEmployee();
    EmployeeEntity findById(long id);
    EmployeeEntity save(EmployeeEntity employeeEntity);
    EmployeeEntity update(EmployeeEntity employeeEntity);
    void deleteEmployee(long id);
}
