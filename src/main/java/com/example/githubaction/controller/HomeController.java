package com.example.githubaction.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Value("${app.version}")
    String version;

    @GetMapping("/")
    public String home() {
        return "Hello CiCd! version: " + version;
    }

    @GetMapping("/admin")
    public String admin() {
        return "hello";
    }
}
