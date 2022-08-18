package com.imatia.statemachine.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";

    @GetMapping("/api/greeting")
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "Stranger") String name) {
        return String.format(template, name);
    }
}
