package com.example.p14_spring_annotation_bean.advisors;

public class SwimCoach implements Coach {

    @Override
    public String getProgram() {
        return "Swim for 15mins.";
    }

}
