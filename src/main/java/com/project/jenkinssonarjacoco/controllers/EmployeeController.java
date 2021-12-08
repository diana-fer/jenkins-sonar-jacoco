package com.project.jenkinssonarjacoco.controllers;

import com.project.jenkinssonarjacoco.dtos.EmployeeDto;
import com.project.jenkinssonarjacoco.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private EmployeeService service;

    @Autowired
    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmployeeDto> get(@PathVariable long id) throws Exception {
        return new ResponseEntity(service.getEmployee(id), HttpStatus.OK);
    }
}
