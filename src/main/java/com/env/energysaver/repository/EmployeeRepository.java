package com.env.energysaver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.env.energysaver.models.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

	public Employee findByEmail(String email);
	
	
}
