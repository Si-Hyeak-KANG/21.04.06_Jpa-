package com.example.jap.bookmanager.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello-world")//url path
    public String helloWorld() {
        return "hello-world";
    }
}
