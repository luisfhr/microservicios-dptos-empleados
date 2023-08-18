package com.fundaisem.employeeservice.controller;

import com.fundaisem.employeeservice.dto.ResponseDTO;
import com.fundaisem.employeeservice.entity.Employee;
import com.fundaisem.employeeservice.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    @PostMapping
    public Employee guardarEmployee(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }

    @GetMapping("/{id}")
    public ResponseDTO getEmployeeById(@PathVariable Integer id){
        return employeeService.getEmployeeById(id);

    }
}
