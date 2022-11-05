package com.example.solid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SolidApplication {

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(SolidApplication.class, args);

        System.out.println("Single Responsibility Principle");
    }

}
