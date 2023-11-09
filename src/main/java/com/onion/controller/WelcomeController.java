package com.onion.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class WelcomeController
{
    @GetMapping
    public String greetMsg()
    {
        log.info("Logging");
        return "Welcome to the SpringBoot App(Docker Image)";
    }
}
