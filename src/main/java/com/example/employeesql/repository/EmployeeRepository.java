package com.example.employeesql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.employeesql.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
