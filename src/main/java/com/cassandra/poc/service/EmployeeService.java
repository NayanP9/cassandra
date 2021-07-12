package com.cassandra.poc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cassandra.poc.model.Employee;
import com.cassandra.poc.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	public EmployeeRepository emprepo;
	
	public void saveMyEmployee(Employee employee) {
		 emprepo.save(employee);
	}
	
}
