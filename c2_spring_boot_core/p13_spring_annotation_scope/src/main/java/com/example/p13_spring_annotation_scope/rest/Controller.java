package com.example.p13_spring_annotation_scope.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private final Singleton singleton1;
    private final Singleton singleton2;

    private final Prototype prototype1;
    private final Prototype prototype2;

    @Autowired
    public Controller(Prototype prototype1, Prototype prototype2, 
        Singleton singleton1, Singleton singleton2, Singleton singleton) {
        this.prototype1 = prototype1;
        this.prototype2 = prototype2;
        this.singleton1 = singleton1;
        this.singleton2 = singleton2;
    }

    @GetMapping("/checkPrototype")
    public String checkPrototype() {
        return prototype1 == prototype2 ? "Prototype Objects are same" : "Prototype Objects are different";
    }
    
    @GetMapping("/checkSingleton")
    public String checkSingleton() {
        return singleton1 == singleton2 ? "Singleton Objects are same" : "Singleton Objects are different";
    }

}
