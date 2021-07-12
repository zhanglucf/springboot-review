package com.example.springboot6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations = {"classpath:fsh.xml"})
public class SpringBoot6Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot6Application.class,args);
    }
}
