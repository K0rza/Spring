package com.example.p14_spring_annotation_bean.advisors;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {

    @Override
    public String getProgram() {
        return "15 mins for running.";
    }

}
