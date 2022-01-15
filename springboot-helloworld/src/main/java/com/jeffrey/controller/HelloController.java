package com.jeffrey.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yifei yang
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello Spring Boot!";
    }
}
