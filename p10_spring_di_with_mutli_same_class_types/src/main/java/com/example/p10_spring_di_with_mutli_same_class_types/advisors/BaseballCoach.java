package com.example.p10_spring_di_with_mutli_same_class_types.advisors;

import org.springframework.stereotype.Component;

import com.example.p10_spring_di_with_mutli_same_class_types.utils.ClassNameFinder;

@Component
public class BaseballCoach implements Coach {

    @Override
    public String giveProgram() {
        return "The program of %s: Cardio for 30 mins."
         .formatted(ClassNameFinder.toClassName(this.getClass().getName()));
  }
}
