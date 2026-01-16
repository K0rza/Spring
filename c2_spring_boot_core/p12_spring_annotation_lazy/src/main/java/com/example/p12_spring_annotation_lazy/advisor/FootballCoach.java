package com.example.p12_spring_annotation_lazy.advisor;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component
public class FootballCoach implements Coach {

    public FootballCoach() {
        System.out.println("Football Coach is created");
    }

    public String getProgram() {
        return "%s :: 30 mins for shooting.".formatted(getClass().getSimpleName());
    }
}
