package com.example.firstservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("second")
public class IndexController {
    @GetMapping("/bye")
    public String helloWorld() {
        return "Bye World";
    }
}
