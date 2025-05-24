package com.env.energysaver.serviceimpl;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.env.energysaver.dto.LeaderboardDto;
import com.env.energysaver.repository.CreditRepository;
import com.env.energysaver.service.CreditService;

@Service
public class CreditServiceImpl implements CreditService{
	
	@Autowired
	private CreditRepository creditRepository;

	@Override
    public Map<String, Object> getCreditsSummary(Long corporateId) {
        Map<String, Object> response = new HashMap<>();

        Integer total = creditRepository.getTotalCredits(corporateId);
        LocalDateTime startOfDay = LocalDate.now().atStartOfDay();
        LocalDateTime endOfDay = LocalDate.now().atTime(LocalTime.MAX);
        Integer today = creditRepository.getTodayCredits(corporateId, startOfDay, endOfDay);

        response.put("corporateId", corporateId);
        response.put("totalCredits", total != null ? total : 0);
        response.put("todayCredits", today != null ? today : 0);
        return response;
    }

	@Override
	public List<LeaderboardDto> getLeaderboard() {
		List<Object[]> rawData = creditRepository.getLeaderboard();
	    List<LeaderboardDto> leaderboard = new ArrayList<>();
	    
	    for (Object[] row : rawData) {
	        Long id = (Long) row[0];
	        String name = (String) row[1];
	        Integer credits = (Integer) row[2];
	        leaderboard.add(new LeaderboardDto(id, name, credits));
	    }

	    return leaderboard;
	}
}
