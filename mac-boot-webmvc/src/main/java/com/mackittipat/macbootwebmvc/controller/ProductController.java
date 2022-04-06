package com.mackittipat.macbootwebmvc.controller;

import com.mackittipat.macbootwebmvc.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("products")
@RestController
public class ProductController {

    @GetMapping
    public Product getProduct() {
        return new Product(1, "Computer", 40000.00D);
    }

}
