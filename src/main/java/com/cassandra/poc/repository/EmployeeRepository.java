package com.cassandra.poc.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import com.cassandra.poc.model.Employee;

@Repository
public interface EmployeeRepository extends CassandraRepository<Employee, Integer> {

	
}
