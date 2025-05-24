package com.env.energysaver.dto;

import java.time.LocalDate;

public class CarbonEmissionDto {
	
	private Long emissionId;
	
	private Float emissionKg;
	
	private LocalDate date;
	
	private Long corporateId;

	public CarbonEmissionDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CarbonEmissionDto(Long emissionId, Float emissionKg, LocalDate date, Long corporateId) {
		super();
		this.emissionId = emissionId;
		this.emissionKg = emissionKg;
		this.date = date;
		this.corporateId = corporateId;
	}

	public Long getEmissionId() {
		return emissionId;
	}

	public void setEmissionId(Long emissionId) {
		this.emissionId = emissionId;
	}

	public Float getEmissionKg() {
		return emissionKg;
	}

	public void setEmissionKg(Float float1) {
		this.emissionKg = float1;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Long getCorporateId() {
		return corporateId;
	}

	public void setCorporateId(Long corporateId) {
		this.corporateId = corporateId;
	}

	@Override
	public String toString() {
		return "CarbonEmissionDto [emissionId=" + emissionId + ", emissionKg=" + emissionKg + ", date=" + date
				+ ", corporateId=" + corporateId + "]";
	}

}
