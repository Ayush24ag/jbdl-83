package com.geek;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication//@SpringBootConfiguration + @ComponentScan + @EnableAutoConfiguration
public class Application {
	public static void main(String[] args) {
		 //initialize spring container
		SpringApplication.run(Application.class, args);
	}
}
