package com.example.Springboot_React_Workshop.service;

import com.example.Springboot_React_Workshop.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);
    EmployeeDto getEmployeeById(Long employeeId);
    List<EmployeeDto> getAllEmployees();
    EmployeeDto updateEmployee(Long employeeId, EmployeeDto updatedEmployeeDto);
    void deleteEmployee(Long employeeId);
}
