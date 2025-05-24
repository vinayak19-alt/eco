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
@Table(name = "deviceUsage")
public class DeviceUsage {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long usageId;

	private LocalDate usageDate;

	private Float hoursUsed;

	private Boolean usedDarkMode;

	private Float estimatedEnergyKwh;

	@ManyToOne
	@JoinColumn(name = "corporate_id")
	private Employee employee;

	public DeviceUsage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DeviceUsage(Long usageId, LocalDate usageDate, Float hoursUsed, Boolean usedDarkMode,
			Float estimatedEnergyKwh, Employee employee) {
		super();
		this.usageId = usageId;
		this.usageDate = usageDate;
		this.hoursUsed = hoursUsed;
		this.usedDarkMode = usedDarkMode;
		this.estimatedEnergyKwh = estimatedEnergyKwh;
		this.employee = employee;
	}

	public Long getUsageId() {
		return usageId;
	}

	public void setUsageId(Long usageId) {
		this.usageId = usageId;
	}

	public LocalDate getUsageDate() {
		return usageDate;
	}

	public void setUsageDate(LocalDate usageDate) {
		this.usageDate = usageDate;
	}

	public Float getHoursUsed() {
		return hoursUsed;
	}

	public void setHoursUsed(Float hoursUsed) {
		this.hoursUsed = hoursUsed;
	}

	public Boolean getUsedDarkMode() {
		return usedDarkMode;
	}

	public void setUsedDarkMode(Boolean usedDarkMode) {
		this.usedDarkMode = usedDarkMode;
	}

	public Float getEstimatedEnergyKwh() {
		return estimatedEnergyKwh;
	}

	public void setEstimatedEnergyKwh(Float estimatedEnergyKwh) {
		this.estimatedEnergyKwh = estimatedEnergyKwh;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "DeviceUsage [usageId=" + usageId + ", usageDate=" + usageDate + ", hoursUsed=" + hoursUsed
				+ ", usedDarkMode=" + usedDarkMode + ", estimatedEnergyKwh=" + estimatedEnergyKwh + ", employee="
				+ employee + "]";
	}

}