package com.mackittipat.macbootwebmvc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RequestMapping("products")
@RestController
public class ProductController {

    @GetMapping
    public String getProduct() {
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject("http://localhost:8085/users", String.class);
        String result2 = restTemplate.getForObject("http://localhost:8085/users/profiles", String.class);
        return result + " - " + result2;
    }

}
