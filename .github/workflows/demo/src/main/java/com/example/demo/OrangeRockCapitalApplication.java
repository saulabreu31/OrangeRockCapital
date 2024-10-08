package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class OrangeRockCapitalApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrangeRockCapitalApplication.class, args);
    }
}

@RestController
class WelcomeController {
    @GetMapping("/")
    public String hello() {
        return "Welcome to Orange Rock Capital!";
    }
}


