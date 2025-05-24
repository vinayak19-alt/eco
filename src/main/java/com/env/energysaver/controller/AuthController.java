package com.env.energysaver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.env.energysaver.dto.EmployeeDto;
import com.env.energysaver.dto.LoginDto;
import com.env.energysaver.dto.RegisterDto;
import com.env.energysaver.models.Employee;
import com.env.energysaver.service.AuthServiceImpl;
import com.env.energysaver.service.EmployeeService;

@RestController
@RequestMapping("/api/v1")
public class AuthController {
	
	@Autowired
	private AuthServiceImpl authServiceImpl;

	@PostMapping("/register")
    public ResponseEntity<?> registerEmployee(@RequestBody RegisterDto dto) {
        try {
            EmployeeDto registeredEmployee = authServiceImpl.register(dto);
            return ResponseEntity.ok(registeredEmployee);
        } catch (RuntimeException e) {
            return ResponseEntity
                    .badRequest()
                    .body(e.getMessage());
        }
    }
	
	@PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginDto dto) {
        try {
            Long corporateId = authServiceImpl.login(dto);
            return ResponseEntity.ok(corporateId);
        } catch (Exception e) {
            return ResponseEntity.status(401).body("Invalid credentials or user not found");
        }
    }
	
}
