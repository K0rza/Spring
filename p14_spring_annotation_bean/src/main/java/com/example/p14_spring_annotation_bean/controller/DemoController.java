package com.example.p14_spring_annotation_bean.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.p14_spring_annotation_bean.advisors.Coach;

@RestController
public class DemoController {

    private Coach coach;
    
    public DemoController(@Qualifier("swimCoach") Coach coach) {
        this.coach = coach;
    }

    @GetMapping("/workout")
    public String getWorkout() {
        return this.coach.getProgram();
    }
}

