package com.example.p09_spring_ioc_and_di_autowire.advisor;

import org.springframework.stereotype.Component;

@Component
public class FutbolCoach implements Coach {

    @Override
    public String getProgram() {
        return "Practice for spinning for 15 minutes and passing for 30 minutes";
    }
}
