package com.example.p13_spring_annotation_scope.rest;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Prototype {

    
}
