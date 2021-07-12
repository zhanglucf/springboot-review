package com.example.springboot6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
public class TestController {

    @Autowired
    private Student student;

    @Autowired
    private Fish fish;

    @PostConstruct
    public void method(){
        System.out.println("--------------------------");
        System.out.println(student);
        System.out.println("--------------------------");
        System.out.println(fish);
    }
}
