package com.mackittipat.macbootwebflux.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RequestMapping("products")
@RestController
public class ProductController {

    @GetMapping
    public Mono<String> getProduct() {
        WebClient client = WebClient.create();
        Mono<String> result =
                Mono.zip(
                        client.get().uri("http://localhost:8085/users").retrieve().bodyToMono(String.class),
                        client
                                .get()
                                .uri("http://localhost:8085/users/profiles")
                                .retrieve()
                                .bodyToMono(String.class),
                        (a, b) -> a + " - " + b);
        return result;
    }
}
