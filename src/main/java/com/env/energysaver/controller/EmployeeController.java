package com.env.energysaver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.env.energysaver.service.CarbonEmissionService;

@RestController
@RequestMapping("api/v1/")
public class EmployeeController {

	@Autowired
	private CarbonEmissionService carbonEmissionService;
	
	@GetMapping("/today/{corporateId}")
    public ResponseEntity<?> getTodaysEmissions(@PathVariable Long corporateId) {
        return ResponseEntity.ok(carbonEmissionService.getEmissionForToday(corporateId));
    }
	
}
