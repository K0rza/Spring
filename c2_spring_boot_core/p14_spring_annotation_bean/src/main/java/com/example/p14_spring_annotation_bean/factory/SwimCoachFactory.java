package com.example.p14_spring_annotation_bean.factory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.p14_spring_annotation_bean.advisors.SwimCoach;

@Configuration
public class SwimCoachFactory {

    @Bean
    public static SwimCoach swimCoach() {
        return new SwimCoach();
    }

}
