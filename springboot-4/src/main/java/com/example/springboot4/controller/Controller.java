package com.example.springboot4.controller;

import com.example.springboot4.constant.FileCategoryEnum;
import com.example.springboot4.entity.DemoDto;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @author zzh
 * @date 2021年06月30日
 */
@RestController
public class Controller {

    @GetMapping
    public Object method(FileCategoryEnum fileCategory){
        System.out.println(fileCategory);
        return fileCategory;
    }


    @GetMapping("/method2")
    public Object method2(@RequestParam FileCategoryEnum fileCategory){
        System.out.println(fileCategory);
        return fileCategory;
    }

    @PostMapping("/method3")
    public Object method3(@RequestBody DemoDto demoDto){
        System.out.println(demoDto);
        return demoDto;
    }

    @GetMapping("/path/{fileCategory}")
    public Object method4(@PathVariable("fileCategory") FileCategoryEnum fileCategory){
        System.out.println(fileCategory);
        return fileCategory;
    }

    @GetMapping("/request-param")
    public Object method5(@RequestParam FileCategoryEnum fileCategory){
        System.out.println(fileCategory);
        return fileCategory;
    }
}
