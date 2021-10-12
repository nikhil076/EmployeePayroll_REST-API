package com.example.employeesql.services;

import java.util.List;

import com.example.employeesql.model.Employee;

public interface EmployeeService {

	Employee createEmployee(Employee employee);
	Employee updateEmployee(Employee employee);
	List<Employee> getAllEmployee();
	Employee getEmployeeById(long id);
	void deleteEmployee(long id);
}
