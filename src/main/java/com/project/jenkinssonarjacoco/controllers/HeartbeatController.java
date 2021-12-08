package com.project.jenkinssonarjacoco.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/heartbeat")
public class HeartbeatController {

    @GetMapping
    public ResponseEntity<String> get() {
        return new ResponseEntity<String>("Accepting connections", HttpStatus.OK);
    }
}
