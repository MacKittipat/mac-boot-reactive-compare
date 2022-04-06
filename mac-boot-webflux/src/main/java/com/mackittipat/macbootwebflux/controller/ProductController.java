package com.mackittipat.macbootwebflux.controller;

import com.mackittipat.macbootwebflux.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RequestMapping("products")
@RestController
public class ProductController {

    @GetMapping
    public Mono<Product> getProduct() {
        return Mono.just(new Product(1, "Computer", 40000.00D));
    }

}
