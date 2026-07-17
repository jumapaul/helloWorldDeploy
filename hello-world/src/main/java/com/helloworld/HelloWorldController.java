package com.helloworld;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/helloWorld")
public class HelloWorldController {
    private final HelloWorldRepository helloWorldRepository;

    public HelloWorldController(HelloWorldRepository repository) {
        this.helloWorldRepository = repository;
    }

    @GetMapping
    public ResponseEntity<String> helloWorld() {
        return ResponseEntity.ok("Hello world");
    }

    @GetMapping("/all")
    public ResponseEntity<List<Points>> getAll() {
        return ResponseEntity.ok(helloWorldRepository.findAll());
    }
}
