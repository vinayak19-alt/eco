package com.env.energysaver.service;

import java.time.LocalDate;
import java.util.List;

import com.env.energysaver.dto.CarbonEmissionDto;
import com.env.energysaver.models.CarbonEmission;
import com.env.energysaver.models.Employee;

public interface CarbonEmissionService {

	List<CarbonEmissionDto> getEmission(Long corporateId);
	
	CarbonEmissionDto getEmissionForToday(Long corporateId);
	
}
