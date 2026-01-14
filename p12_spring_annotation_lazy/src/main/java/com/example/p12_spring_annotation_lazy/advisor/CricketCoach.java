package com.example.p12_spring_annotation_lazy.advisor;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("Cricket Coach is created");
    }

    @Override
    public String getProgram() {
        return "30 mins run.";
    }
}
