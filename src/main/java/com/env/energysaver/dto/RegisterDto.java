package com.env.energysaver.dto;

public class RegisterDto {
	
	private Long corporateId;

	private String password;

	private String email;

	private String name;

	private String phoneNumber;
	
	private String department;

	public RegisterDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RegisterDto(Long corporateId, String password, String email, String name, String phoneNumber,
			String department) {
		super();
		this.corporateId = corporateId;
		this.password = password;
		this.email = email;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.department = department;
	}

	public Long getCorporateId() {
		return corporateId;
	}

	public void setCorporateId(Long corporateId) {
		this.corporateId = corporateId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	@Override
	public String toString() {
		return "RegisterDto [corporateId=" + corporateId + ", password=" + password + ", email=" + email + ", name="
				+ name + ", phoneNumber=" + phoneNumber + "]";
	}
	
	

}
