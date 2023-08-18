package com.fundaisem.employeeservice.service;

import com.fundaisem.employeeservice.dto.DepartamentDTO;
import com.fundaisem.employeeservice.dto.ResponseDTO;
import com.fundaisem.employeeservice.entity.Employee;
import com.fundaisem.employeeservice.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@AllArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final RestTemplate restTemplate;

    public Employee saveEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public ResponseDTO getEmployeeById(Integer id){
        ResponseDTO responseDTO = new ResponseDTO();
        Employee employee = new Employee();
        employee = employeeRepository.findById(id).get();

        ResponseEntity<DepartamentDTO> responseEntity = restTemplate.getForEntity("http://localhost:8080/api/departaments/"+employee.getDepartamentId(), DepartamentDTO.class);

        DepartamentDTO departamentDTO = responseEntity.getBody();

        responseDTO.setEmployee(employee);
        responseDTO.setDepartamentDTO(departamentDTO);

        return responseDTO;
    }
}

