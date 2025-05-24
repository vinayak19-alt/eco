package com.env.energysaver.models;

import java.util.ArrayList;
import java.util.List;

import org.apache.el.parser.AstFalse;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {

	@Id
	@Column(unique = true, nullable = false)
	private Long corporateId;

	private String name;
	@Column(unique = true)
	private String email;
	
	private String phoneNumber;

	@OneToOne
	@JoinColumn(name = "department_id")
	private Department department;

	@OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
	private List<DeviceUsage> usages = new ArrayList<>();
	@OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
	private List<CarbonEmission> emissions = new ArrayList<>();
	@OneToOne(mappedBy = "employee", cascade = CascadeType.ALL)
	private Credit credits;
	@OneToOne(mappedBy = "employee", cascade = CascadeType.ALL)
	private LeaderBoard leaderBoard;
	@OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
	private List<Notification> notifications = new ArrayList<>();

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

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<DeviceUsage> getUsages() {
		return usages;
	}

	public void setUsages(List<DeviceUsage> usages) {
		this.usages = usages;
	}

	public List<CarbonEmission> getEmissions() {
		return emissions;
	}

	public void setEmissions(List<CarbonEmission> emissions) {
		this.emissions = emissions;
	}

	public Credit getCredits() {
		return credits;
	}

	public void setCredits(Credit credits) {
		this.credits = credits;
	}

	public LeaderBoard getLeaderBoard() {
		return leaderBoard;
	}

	public void setLeaderBoard(LeaderBoard leaderBoard) {
		this.leaderBoard = leaderBoard;
	}

	public List<Notification> getNotifications() {
		return notifications;
	}

	public void setNotifications(List<Notification> notifications) {
		this.notifications = notifications;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Employee(Long corporateId, String name, String email, Department department,
			List<DeviceUsage> usages, List<CarbonEmission> emissions, Credit credits,
			LeaderBoard leaderBoard, List<Notification> notifications, String phoneNumber) {
		super();
		this.corporateId = corporateId;
		this.name = name;
		this.email = email;
		this.department = department;
		this.usages = usages;
		this.emissions = emissions;
		this.credits = credits;
		this.leaderBoard = leaderBoard;
		this.notifications = notifications;
		this.phoneNumber = phoneNumber;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [corporateId=" + corporateId + ", name=" + name + ", email=" + email + ", phoneNumber="
				+ phoneNumber + ", department=" + department + ", usages=" + usages
				+ ", emissions=" + emissions + ", credits=" + credits + ", leaderBoard=" + leaderBoard
				+ ", notifications=" + notifications + "]";
	}

	

}