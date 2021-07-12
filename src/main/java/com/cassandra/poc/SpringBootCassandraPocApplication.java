package com.cassandra.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@EnableCassandraRepositories
@SpringBootApplication
public class SpringBootCassandraPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCassandraPocApplication.class, args);
	}

}
