package com.example.p12_spring_annotation_lazy.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.p12_spring_annotation_lazy.advisor.Coach;

@RestController
public class Controller {

    private Coach coach;

    @Autowired
    public Controller(@Qualifier("basketballCoach") Coach coach) {
        this.coach = coach;
    }

    @GetMapping("/workout")
    public String sayFootballWorkout() {
        return coach.getProgram();
    }

    @GetMapping("/player")
    public String coachName() {
        return "This is player name";
    }
}
