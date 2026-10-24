package com.example.hellospringboot.controller;

import org.springframework.web.bind.annotation.GetMapping; //Imports Spring's tool to handle web request routing and map URLs to methods
import org.springframework.web.bind.annotation.RestController; //Imports Spring's tool to mark this class as a web endpoint that returns direct data


@RestController // Tells Spring Boot that this class is a Controller responsible for handling web API traffic
public class ExampleController {

    @GetMapping("/")  // Listens for web browser requests hitting the base root URL path
    public String hello() {
        return "Hello Spring Boot";
    }

}
