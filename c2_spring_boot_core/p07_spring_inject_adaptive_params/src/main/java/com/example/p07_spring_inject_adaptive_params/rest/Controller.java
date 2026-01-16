package com.example.p07_spring_inject_adaptive_params.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Value("${param.user.name}")
    private String userName;
    @Value("${param.user.surname}")
    private String userSurname;
    @Value("${param.user.birthdata}")
    private String userBirthDate;
    @Value("${param.user.gender}")
    private String userGender;

    @GetMapping("/user/info") 
    private String showUserInfo() {
        return """
                User Name : %s %s \n
                User BirthDate : %s \n
                User Gender: %s \n
                """.formatted(userName.toUpperCase(), userSurname.toUpperCase(), userBirthDate, userGender.toUpperCase());
    }
}
