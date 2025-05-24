package com.env.energysaver.serviceimpl;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.env.energysaver.dto.CarbonEmissionDto;
import com.env.energysaver.models.CarbonEmission;
import com.env.energysaver.models.Employee;
import com.env.energysaver.repository.CarbonEmissionRepository;
import com.env.energysaver.service.CarbonEmissionService;

@Service
public class CarbonEmissionServiceImpl implements CarbonEmissionService{
	
	@Autowired
	private CarbonEmissionRepository carbonEmissionRepository;

	public List<CarbonEmissionDto> getEmission(Long corporateId) {
        LocalDate today = LocalDate.now();
        LocalDate firstDayOfMonth = today.with(TemporalAdjusters.firstDayOfMonth());
        List<CarbonEmission> carbonEmission = carbonEmissionRepository.findByEmployee_CorporateIdAndDateBetween(corporateId, firstDayOfMonth, today);
        List<CarbonEmissionDto> dtoList = new ArrayList<>();
        for (CarbonEmission obj : carbonEmission) {
            CarbonEmissionDto dto = new CarbonEmissionDto();
            dto.setCorporateId(obj.getEmployee().getCorporateId());
            dto.setDate(obj.getDate());
            dto.setEmissionId(obj.getEmissionId());
            dto.setEmissionKg(obj.getEmissionKg()); 

            dtoList.add(dto);
        }
        return dtoList;
        
    }

	@Override
	public CarbonEmissionDto getEmissionForToday(Long corporateId) {
		LocalDate today = LocalDate.now();
//        return carbonEmissionRepository.findByEmployee_CorporateIdAndDate(corporateId, today);
		return null;
	}
	
}
