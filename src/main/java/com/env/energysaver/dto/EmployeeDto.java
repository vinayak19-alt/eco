package com.env.energysaver.dto;

import com.env.energysaver.models.Department;
import com.env.energysaver.models.Seat;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

public class EmployeeDto {
	
	private Long corporateId;

	private String name;
	private String email;
	
	private String phoneNumber;

	private String department;
	
	private int currentSeat;

	public EmployeeDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeDto(Long corporateId, String name, String email, String phoneNumber, String department,
			int currentSeat) {
		super();
		this.corporateId = corporateId;
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.department = department;
		this.currentSeat = currentSeat;
	}

	public Long getCorporateId() {
		return corporateId;
	}

	public void setCorporateId(Long corporateId) {
		this.corporateId = corporateId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getCurrentSeat() {
		return currentSeat;
	}

	public void setCurrentSeat(int currentSeat) {
		this.currentSeat = currentSeat;
	}

	@Override
	public String toString() {
		return "EmployeeDto [corporateId=" + corporateId + ", name=" + name + ", email=" + email + ", phoneNumber="
				+ phoneNumber + ", department=" + department + ", currentSeat=" + currentSeat + "]";
	}
	
	

}
