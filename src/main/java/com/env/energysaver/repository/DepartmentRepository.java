package com.env.energysaver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.env.energysaver.models.Department;
import java.util.List;


@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

	public Department findByDeptName(String deptName);
	
}
