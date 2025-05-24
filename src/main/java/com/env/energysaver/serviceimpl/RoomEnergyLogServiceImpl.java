package com.env.energysaver.serviceimpl;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.TemporalAdjusters;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.env.energysaver.repository.RoomEnergyLogRepository;
import com.env.energysaver.service.RoomEnergyLogService;

@Service
public class RoomEnergyLogServiceImpl implements RoomEnergyLogService {

	@Autowired
    private RoomEnergyLogRepository roomEnergyLogRepository;
	@Override
	public Float getTotalEnergyForCurrentMonth(Long roomId) {
        LocalDateTime startOfMonth = LocalDate.now()
            .with(TemporalAdjusters.firstDayOfMonth())
            .atStartOfDay();

        LocalDateTime now = LocalDateTime.now();

        Float total = roomEnergyLogRepository.getMonthlyTotalEnergyKwh(roomId, startOfMonth, now);
        return total != null ? total : 0.0f;
    }
	
	
}
