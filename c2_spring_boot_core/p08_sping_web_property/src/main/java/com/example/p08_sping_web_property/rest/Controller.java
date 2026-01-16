package com.example.p08_sping_web_property.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {

    @GetMapping("/")
    public String saySmth() {
        return "SAMPIYON BESIKTAS";
    }
    
}
