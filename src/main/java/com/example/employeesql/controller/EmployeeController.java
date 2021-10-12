package com.example.employeesql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.employeesql.model.Employee;
import com.example.employeesql.services.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employee/{id}")
	public Employee findById(@PathVariable("id") int id) {
		return employeeService.getEmployeeById(id);
	}
	
	@PostMapping("/addemployee")
	public Employee addEmployee(@RequestBody Employee employee) {
		return employeeService.createEmployee(employee);
	}
	
	@GetMapping("/allemployee")
	public List<Employee> allEmployee(@RequestBody Employee employee) {
		return employeeService.getAllEmployee();
	}
}
