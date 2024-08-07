package com.developer.employee_management.service;

import com.developer.employee_management.entity.EmployeeEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List<EmployeeEntity> findAllEmployee();
    EmployeeEntity findById(long id);
    EmployeeEntity save(EmployeeEntity employeeEntity);
    EmployeeEntity update(EmployeeEntity employeeEntity);
    void deleteEmployee(long id);
}
