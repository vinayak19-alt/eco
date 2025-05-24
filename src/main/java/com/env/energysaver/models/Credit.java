package com.env.energysaver.models;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "credit")
public class Credit {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long creditId;
	
	private Integer totalCredits;
	
	private Integer awePoints;
	
	private LocalDateTime lastUpdated;
	
	@OneToOne
	@JoinColumn(name = "corporate_id")
	private Employee employee;

	public Credit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Credit(Long creditId, Integer totalCredits, Integer awePoints, LocalDateTime lastUpdated,
			Employee employee) {
		super();
		this.creditId = creditId;
		this.totalCredits = totalCredits;
		this.awePoints = awePoints;
		this.lastUpdated = lastUpdated;
		this.employee = employee;
	}

	public Long getCreditId() {
		return creditId;
	}

	public void setCreditId(Long creditId) {
		this.creditId = creditId;
	}

	public Integer getTotalCredits() {
		return totalCredits;
	}

	public void setTotalCredits(Integer totalCredits) {
		this.totalCredits = totalCredits;
	}

	public Integer getAwePoints() {
		return awePoints;
	}

	public void setAwePoints(Integer awePoints) {
		this.awePoints = awePoints;
	}

	public LocalDateTime getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(LocalDateTime lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Credit [creditId=" + creditId + ", totalCredits=" + totalCredits + ", awePoints=" + awePoints
				+ ", lastUpdated=" + lastUpdated + ", employee=" + employee + "]";
	}
	
	

}