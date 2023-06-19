package com.javaapp.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
@SuppressWarnings("java:S5961")

@SpringBootApplication
@EnableMongoRepositories("com.javaapp.demo")
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
