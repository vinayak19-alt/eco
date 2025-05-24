package com.env.energysaver.models;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "carbonEmission")
public class CarbonEmission {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long emissionId;
	
	private LocalDate date;
	
	private Float emissionKg;
	
	@ManyToOne
	@JoinColumn(name = "corporate_id")
	private Employee employee;

	public CarbonEmission() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CarbonEmission(Long emissionId, LocalDate date, Float emissionKg, Employee employee) {
		super();
		this.emissionId = emissionId;
		this.date = date;
		this.emissionKg = emissionKg;
		this.employee = employee;
	}

	public Long getEmissionId() {
		return emissionId;
	}

	public void setEmissionId(Long emissionId) {
		this.emissionId = emissionId;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Float getEmissionKg() {
		return emissionKg;
	}

	public void setEmissionKg(Float emissionKg) {
		this.emissionKg = emissionKg;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "CarbonEmission [emissionId=" + emissionId + ", date=" + date + ", emissionKg=" + emissionKg
				+ ", employee=" + employee + "]";
	}
	
	

}