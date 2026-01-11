package com.example.p10_spring_di_with_mutli_same_class_types.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.p10_spring_di_with_mutli_same_class_types.advisors.Coach;

@RestController
public class Controller {

    private final Coach coach;

    @Autowired
    public Controller(@Qualifier("footballCoach") Coach coach) {
        this.coach = coach;
    }

    @GetMapping("/workout")
    public String sayProgram() {
        return this.coach.giveProgram();
    }

}
