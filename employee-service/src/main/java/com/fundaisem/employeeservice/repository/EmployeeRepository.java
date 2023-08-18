package com.fundaisem.employeeservice.repository;

import com.fundaisem.employeeservice.entity.Employee;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
