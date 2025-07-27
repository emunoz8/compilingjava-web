package com.compilingjava.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class ApiController {

    @GetMapping("/")
    public String landing() {
        return "Hello and Welcome to my Website";
    }
}
