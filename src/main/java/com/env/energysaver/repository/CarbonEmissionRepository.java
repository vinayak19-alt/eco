package com.env.energysaver.repository;


import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.env.energysaver.models.CarbonEmission;


@Repository
public interface CarbonEmissionRepository extends JpaRepository<com.env.energysaver.models.CarbonEmission, Long> {

	public List<CarbonEmission> findByEmployee_CorporateIdAndDateBetween(Long corporateId, LocalDate startDate, LocalDate endDate);
	
	CarbonEmission findByEmployee_CorporateIdAndDate(Long corporateId, LocalDate date);
	
	@Query("SELECT SUM(c.emissionKg) FROM CarbonEmission c WHERE c.employee.corporateId = :corporateId AND c.date BETWEEN :startDate AND :endDate")
	Float sumEmissionsByEmployeeAndDateRange(@Param("corporateId") Long corporateId,
	                                         @Param("startDate") LocalDate startDate,
	                                         @Param("endDate") LocalDate endDate);
	
}
