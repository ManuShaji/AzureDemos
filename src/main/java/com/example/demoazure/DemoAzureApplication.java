package com.example.demoazure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoAzureApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoAzureApplication.class, args);
    }
@GetMapping("/message")
    public String message(){
        return "Hey Hii , I am Using Azure App service";
}
}
