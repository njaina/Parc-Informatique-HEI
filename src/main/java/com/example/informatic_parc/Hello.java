package com.example.informatic_parc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @GetMapping("/")
    public String Main(){
        return "Hello there,welcome";
    }

}
