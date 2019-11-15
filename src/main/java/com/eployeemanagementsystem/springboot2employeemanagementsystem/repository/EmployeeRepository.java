package com.eployeemanagementsystem.springboot2employeemanagementsystem.repository;

import com.eployeemanagementsystem.springboot2employeemanagementsystem.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
