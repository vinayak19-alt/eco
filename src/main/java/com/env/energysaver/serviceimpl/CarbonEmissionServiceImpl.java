package com.env.energysaver.serviceimpl;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.env.energysaver.dto.CarbonEmissionDto;
import com.env.energysaver.models.CarbonEmission;
import com.env.energysaver.repository.CarbonEmissionRepository;
import com.env.energysaver.service.CarbonEmissionService;

@Service
public class CarbonEmissionServiceImpl implements CarbonEmissionService{
	
	@Autowired
	private CarbonEmissionRepository carbonEmissionRepository;

	public Map<String, Object> getEmission(Long corporateId) {
	    LocalDate today = LocalDate.now();
	    LocalDate firstDayOfMonth = today.with(TemporalAdjusters.firstDayOfMonth());

	    Float totalEmission = carbonEmissionRepository
	        .sumEmissionsByEmployeeAndDateRange(corporateId, firstDayOfMonth, today);

	    Map<String, Object> response = new HashMap<>();
	    response.put("corporateId", corporateId);
	    response.put("totalEmissionKg", totalEmission != null ? totalEmission : 0.0f); // default to 0

	    return response;
	}


	@Override
	public CarbonEmissionDto getEmissionForToday(Long corporateId) {
		LocalDate today = LocalDate.now();
        CarbonEmission obj = carbonEmissionRepository.findByEmployee_CorporateIdAndDate(corporateId, today);
        CarbonEmissionDto dto = new CarbonEmissionDto();
        dto.setCorporateId(obj.getEmployee().getCorporateId());
        dto.setDate(obj.getDate());
        dto.setEmissionId(obj.getEmissionId());
        dto.setEmissionKg(obj.getEmissionKg()); 
        
        return dto;
        
	}
	
}
