package com.aisa.coffeemaker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.aisa.coffeemaker.dao")
public class CoffeemakerApplication {
    public static void main(String[] args) {
        SpringApplication.run(CoffeemakerApplication.class, args);
    }
}
