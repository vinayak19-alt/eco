package com.env.energysaver.repository;


import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.env.energysaver.dto.CarbonEmissionDto;
import com.env.energysaver.models.CarbonEmission;


@Repository
public interface CarbonEmissionRepository extends JpaRepository<com.env.energysaver.models.CarbonEmission, Long> {

	public List<CarbonEmission> findByEmployee_CorporateIdAndDateBetween(Long corporateId, LocalDate startDate, LocalDate endDate);
	
	CarbonEmission findByEmployee_CorporateIdAndDate(Long corporateId, LocalDate date);
	
}
