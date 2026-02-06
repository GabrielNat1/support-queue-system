package com.example.support_queue_system.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {
    @GetMapping({"/", "/health"})
    public String test(){
        return "working";
    }
}
