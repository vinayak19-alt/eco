package com.env.energysaver.service;

import java.util.List;
import java.util.Map;

import com.env.energysaver.dto.LeaderboardDto;

public interface CreditService {

	Map<String, Object> getCreditsSummary(Long corporateId);
	
	List<LeaderboardDto> getLeaderboard();
	
}
