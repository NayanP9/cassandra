package com.cassandra.poc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cassandra.poc.model.Employee;
import com.cassandra.poc.service.EmployeeService;



@RestController
public class EmployeeController {
	
	
	@Autowired
	private EmployeeService empservice;
	
	@PostMapping("/save-employee")
	@Transactional
	public String registerEmployee(@RequestBody Employee employee) {
		empservice.saveMyEmployee(employee);
		return "Hello,"+employee.getName() + "your registration is done";	
	}
}
