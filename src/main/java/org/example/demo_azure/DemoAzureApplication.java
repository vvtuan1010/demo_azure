package org.example.demo_azure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoAzureApplication {

    @GetMapping("/message")
    private String message(){
        return "hello world";
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoAzureApplication.class, args);
    }

}
