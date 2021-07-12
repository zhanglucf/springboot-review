package com.example.springboot5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
public class TestController {

    @Autowired
    private Student student;

    @PostConstruct
    public void method(){
        System.out.println("--------------------------");
        System.out.println(student);
        System.out.println("--------------------------");
    }
}
