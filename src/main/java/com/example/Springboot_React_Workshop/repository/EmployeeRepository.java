package com.example.Springboot_React_Workshop.repository;

import com.example.Springboot_React_Workshop.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
