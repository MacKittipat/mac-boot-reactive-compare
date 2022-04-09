package com.mackittipat.macbootextapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("users")
@RestController
public class UserController {

    @GetMapping("")
    public String getUser() throws InterruptedException {
        Thread.sleep(300);
        return "User";
    }

    @GetMapping("profiles")
    public String getProfile() throws InterruptedException {
        Thread.sleep(150);
        return "Profile";
    }
}
