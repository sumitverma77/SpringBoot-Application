package com.springboot.application.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {
    @RequestMapping("/hello")
    String hello(String name) {
        return "welcome";
    }
    @PreAuthorize("hasRole('USER')")
    @RequestMapping("/user")
    String user(String name) {
        return "welcome user";
    }
    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping("/admin")
    String admin(String name) {
        return "welcome admin";
    }
}
