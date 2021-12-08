package com.project.jenkinssonarjacoco.services;

import com.project.jenkinssonarjacoco.dtos.EmployeeDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    private List<EmployeeDto> employeeDtos = List.of(
            new EmployeeDto(1l, "John", "Doe", "john.doe@email.com"),
            new EmployeeDto(2l, "Jane", "Smith", "jane.smith@email.com"),
            new EmployeeDto(3l, "Sarah", "Parker", "sarah.parker@email.com")
    );

    public EmployeeDto getEmployee(Long id) throws Exception {
        try {
            return employeeDtos.stream().filter(e -> e.getId() == id).findFirst().get();
        } catch(Exception e) {
            throw new Exception(e);
        }
    }
}
