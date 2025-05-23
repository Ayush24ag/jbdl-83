package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication//default @ComponentScan scans current package & its sub packages
@ComponentScan(basePackages = "com.example")
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
