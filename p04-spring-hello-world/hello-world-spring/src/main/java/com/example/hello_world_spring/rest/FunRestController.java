package com.example.hello_world_spring.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FunRestController {

    // '/' karakteri girildiğinde "Hello World" yazdıracak

    @GetMapping("/")
    public String sayHello() { return "Hello World";}

    @GetMapping("/workout")
    public String sayTheCongrats5km() {return "Congrats for 5km!";}
    

}
