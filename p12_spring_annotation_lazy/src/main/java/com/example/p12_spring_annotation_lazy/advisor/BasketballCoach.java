package com.example.p12_spring_annotation_lazy.advisor;

import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach {

    public BasketballCoach() {
        System.out.println("Basketball Coach is created.");
    }

    public String getProgram() {
        return "%s :: 15 mins for shooting and 15 mins for passing".formatted(getClass().getSimpleName());
    }

}
