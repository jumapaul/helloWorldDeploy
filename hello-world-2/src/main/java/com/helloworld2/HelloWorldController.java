package com.helloworld2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloWorld2")
public class HelloWorldController {

    @GetMapping
    public String helloWorld(){
        return "This is hello world 2";
    }
}
