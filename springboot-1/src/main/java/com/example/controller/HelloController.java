package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zzh
 * @date 2021年06月01日
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public Object method() {
        return "hello word";
    }
}
