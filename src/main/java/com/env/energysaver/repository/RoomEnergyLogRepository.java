package com.env.energysaver.repository;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.env.energysaver.models.RoomEnergyLog;

@Repository
public interface RoomEnergyLogRepository extends JpaRepository<RoomEnergyLog, Long>{

	@Query("SELECT SUM(r.totalEnergyKwh) FROM RoomEnergyLog r " +
	           "WHERE r.room.roomId = :roomId AND r.timeStamp BETWEEN :start AND :end")
	    Float getMonthlyTotalEnergyKwh(
	        @Param("roomId") Long roomId,
	        @Param("start") LocalDateTime start,
	        @Param("end") LocalDateTime end
	    );
	
	
}
