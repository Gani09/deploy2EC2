package com.gani.learning.deploy2EC2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class sampleController {

    @GetMapping("/")
    private String greet(){
        return "Hello this is me from application";
    }
}
