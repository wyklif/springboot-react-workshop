package com.example.Springboot_React_Workshop.service;

import com.example.Springboot_React_Workshop.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);
    EmployeeDto getEmployeeById(Long employeeId);
}
