package com.iffat.springboot.springcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
        scanBasePackages = {"com.iffat.springboot.springcore", "com.iffat.springboot.util"}
)
public class SpringBootSpringCoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootSpringCoreApplication.class, args);
    }

}
