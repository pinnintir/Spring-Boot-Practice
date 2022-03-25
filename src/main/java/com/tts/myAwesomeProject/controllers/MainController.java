package com.tts.myAwesomeProject.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @RequestMapping("/")//https:localhost:4000/
    public String home() {//method name doesn't matter much
        return "Hello World!";
    }
}