package com.developer.employee_management.repository;
import  org.springframework.data.jpa.repository.JpaRepository;
import com.developer.employee_management.entity.EmployeeEntity;
import org.springframework.stereotype.Repository;

@Repository

public interface EmployeeRepository extends JpaRepository <EmployeeEntity, Long> {

}
