package com.env.energysaver.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "department")
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long departmentId;
	@Column(unique = true, nullable = false)
	private String deptName;
	@OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
	private List<Room> rooms = new ArrayList<>();
	@OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
	private List<Employee> employees = new ArrayList<>();
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(Long departmentId, String deptName, List<Room> rooms, List<Employee> employees) {
		super();
		this.departmentId = departmentId;
		this.deptName = deptName;
		this.rooms = rooms;
		this.employees = employees;
	}
	public Long getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public List<Room> getRooms() {
		return rooms;
	}
	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", deptName=" + deptName + ", rooms=" + rooms
				+ ", employees=" + employees + "]";
	}
	
	
}