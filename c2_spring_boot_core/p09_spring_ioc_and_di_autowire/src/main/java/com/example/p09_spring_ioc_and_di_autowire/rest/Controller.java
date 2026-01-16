package com.example.p09_spring_ioc_and_di_autowire.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.p09_spring_ioc_and_di_autowire.advisor.Coach;

@RestController
public class Controller {
    
    private final Coach coach;

    @Autowired
    public Controller(Coach coach) {
        this.coach = coach;
    }

    @GetMapping("/dailyworkout")
    public String getWorkout() {
        return coach.getProgram();        
    }
}
