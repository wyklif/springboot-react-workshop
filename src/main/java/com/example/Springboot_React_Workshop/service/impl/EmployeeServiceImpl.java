package com.example.Springboot_React_Workshop.service.impl;

import com.example.Springboot_React_Workshop.dto.EmployeeDto;
import com.example.Springboot_React_Workshop.entity.Employee;
import com.example.Springboot_React_Workshop.exception.ResourceNotFoundException;
import com.example.Springboot_React_Workshop.mapper.EmployeeMapper;
import com.example.Springboot_React_Workshop.repository.EmployeeRepository;
import com.example.Springboot_React_Workshop.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;
    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);

        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }

    @Override
    public EmployeeDto getEmployeeById(Long employeeId) {
        Employee employee = employeeRepository.findById(employeeId)
                .orElseThrow(()->new ResourceNotFoundException("Employee not found with id " + employeeId));
        return EmployeeMapper.mapToEmployeeDto(employee);
    }
}
