package com.example.p10_spring_di_with_mutli_same_class_types.advisors;

import org.springframework.stereotype.Component;

import com.example.p10_spring_di_with_mutli_same_class_types.utils.ClassNameFinder;

@Component
public class FootballCoach implements Coach {

    @Override
    public String giveProgram() {
        return "The program of %s: Pass for 15 mins and Shot for 15 mins"
            .formatted(ClassNameFinder.toClassName(this.getClass().getName()));
    }

}
