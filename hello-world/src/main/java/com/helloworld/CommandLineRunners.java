package com.helloworld;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CommandLineRunners implements CommandLineRunner {

    private final HelloWorldRepository helloWorldRepository;

    public CommandLineRunners(HelloWorldRepository repository){
        this.helloWorldRepository = repository;
    }

    @Override
    public void run(String... args) {

        List<Users> users = List.of(
                new Users(1, "Juma Paul", 20, "Olkalau"),
                new Users(2, "John Doe", 34, "Nyamasara"),
                new Users(3, "Kevin Makau", 11, "Ndiru"),
                new Users(4, "Elisha Toto", 33, "Element")
        );

        helloWorldRepository.saveAll(users);
    }
}
