package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class HelloController {
    // --> /hello
    @GetMapping("hello")
    public String Hello() {
        return "<h1> Hello World <h1>";
    }
}
