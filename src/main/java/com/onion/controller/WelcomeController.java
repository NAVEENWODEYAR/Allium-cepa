package com.onion.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController
{
    @GetMapping
    public String greetMsg()
    {
        return "Welcome to the SpringBoot App(Docker Image)";
    }
}
