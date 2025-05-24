package com.env.energysaver.repository;


import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.env.energysaver.models.Credit;


@Repository
public interface CreditRepository extends JpaRepository<Credit, Long> {

	@Query("SELECT e.totalCredits FROM Credit e WHERE e.employee.corporateId = :corporateId")
    Integer getTotalCredits(@Param("corporateId") Long corporateId);

    @Query("SELECT e.awePoints FROM Credit e " +
           "WHERE e.employee.corporateId = :corporateId " +
           "AND e.lastUpdated BETWEEN :start AND :end")
    Integer getTodayCredits(@Param("corporateId") Long corporateId,
                            @Param("start") LocalDateTime start,
                            @Param("end") LocalDateTime end);
    
    @Query("SELECT e.employee.corporateId, e.employee.name, e.totalCredits " +
    	       "FROM Credit e ORDER BY e.totalCredits DESC")
    	List<Object[]> getLeaderboard();
	
}
