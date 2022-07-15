package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("get")
public class Controller1 {
    @GetMapping("get./gradlew appengineDeploy")
    public String  get(){

        return "app engine deploy successfully";

    }
}
