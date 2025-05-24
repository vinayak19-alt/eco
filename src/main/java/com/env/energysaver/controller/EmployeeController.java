package com.env.energysaver.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.env.energysaver.dto.LeaderboardDto;
import com.env.energysaver.service.CarbonEmissionService;
import com.env.energysaver.service.CreditService;
import com.env.energysaver.service.RoomEnergyLogService;

@RestController
@RequestMapping("api/v1/")
public class EmployeeController {

	@Autowired
	private CarbonEmissionService carbonEmissionService;
	
	@Autowired
	private RoomEnergyLogService roomEnergyLogService;
	
	@Autowired
	private CreditService creditService;
	
	@GetMapping("/today/{corporateId}")
    public ResponseEntity<?> getTodaysEmissions(@PathVariable Long corporateId) {
        return ResponseEntity.ok(carbonEmissionService.getEmissionForToday(corporateId));
    }
	
	@GetMapping("/month/{corporateId}")
	public ResponseEntity<?> getMonthlyEmissions(@PathVariable Long corporateId) {
	    return ResponseEntity.ok(carbonEmissionService.getEmission(corporateId));
	}

    @GetMapping("/monthly-total/{roomId}")
    public ResponseEntity<?> getMonthlyEnergyTotal(@PathVariable Long roomId) {
        Float total = roomEnergyLogService.getTotalEnergyForCurrentMonth(roomId);
        Map<String, Object> response = new HashMap<>();
        response.put("roomId", roomId);
        response.put("totalEnergyKwh", total);
        return ResponseEntity.ok(response);
    }
    
    @GetMapping("/credits/{corporateId}")
    public ResponseEntity<?> getCredits(@PathVariable Long corporateId) {
        return ResponseEntity.ok(creditService.getCreditsSummary(corporateId));
    }
    
    @GetMapping("/leaderboard")
    public ResponseEntity<List<LeaderboardDto>> getLeaderboard() {
        return ResponseEntity.ok(creditService.getLeaderboard());
    }
    
    
}
