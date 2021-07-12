package com.example.springboot5;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Data
@ToString
@Component
@ConfigurationProperties(prefix = "stu")
public class Student {
    private Long id;
    private String studentName;
    private Date birth;
    private List<String> strList;
    private Map<String,String> strMap;
    private List<Dog> dogs;
    private Map<String,Cat> catMap;
}
