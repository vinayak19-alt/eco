package com.env.energysaver.service;

import java.security.PrivateKey;

import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import com.env.energysaver.dto.EmployeeDto;
import com.env.energysaver.dto.LoginDto;
import com.env.energysaver.dto.RegisterDto;
import com.env.energysaver.models.Department;
import com.env.energysaver.models.Employee;
import com.env.energysaver.models.User;
import com.env.energysaver.repository.DepartmentRepository;
import com.env.energysaver.repository.EmployeeRepository;
import com.env.energysaver.repository.UserRepository;
//import com.env.energysaver.security.JwtTokenProvider;

@Service
public class AuthServiceImpl {

//    @Autowired
//    private AuthenticationManager authenticationManager;

    @Autowired
    private UserRepository userRepository;
    
    @Autowired
    private ModelMapper modelMapper;

//    @Autowired
//    private PasswordEncoder passwordEncoder;
    
    @Autowired
    private EmployeeRepository emplrepo;
    
    @Autowired
    private DepartmentRepository departmentRepository;
  
    
    

   

//    @Autowired
//    private JwtTokenProvider jwtTokenProvider;

    public Long login(LoginDto dto) {
//        Authentication authentication = authenticationManager.authenticate(
//                new UsernamePasswordAuthenticationToken(dto.getUsername(), dto.getPassword()));
//        SecurityContextHolder.getContext().setAuthentication(authentication);
//
//        String token = jwtTokenProvider.generateToken(authentication);

        Employee employee = new Employee();
        if(userRepository.existsByMail(dto.getEmail())) {
        	employee = emplrepo.findByEmail(dto.getEmail());
        }
        
        return employee.getCorporateId();
    }

    public EmployeeDto register(RegisterDto dto) throws RuntimeException {
        // Check if username or email already exists
    	if (userRepository.existsByMail(dto.getEmail())) {
            throw new RuntimeException("Employee with given email or corporate ID already exists.");
        }
    	
    	 User user = new User();
         user.setMail(dto.getEmail());
         user.setPassword(dto.getPassword());
         userRepository.save(user);
 
        Employee employee = new Employee();
        employee.setCorporateId(dto.getCorporateId());
        employee.setName(dto.getName());
        employee.setEmail(dto.getEmail());
        employee.setPhoneNumber(dto.getPhoneNumber());
        Department department = departmentRepository.findByDeptName(dto.getDepartment());
        employee.setDepartment(department);
        
        emplrepo.save(employee);
        
        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setCorporateId(employee.getCorporateId());
        employeeDto.setName(employee.getName());
        employeeDto.setEmail(employee.getEmail());
        employeeDto.setPhoneNumber(employee.getPhoneNumber());
        employeeDto.setDepartment(department.getDeptName());
        
//        employeeDto.setCurrentSeat(1);
 
        return employeeDto;
    }

}