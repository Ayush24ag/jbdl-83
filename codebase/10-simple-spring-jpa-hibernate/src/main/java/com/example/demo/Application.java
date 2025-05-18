package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.entity.Customer;
import com.example.demo.repository.CustomerRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx=
		SpringApplication.run(Application.class, args);
		Customer c=new Customer();
		c.setCustId(101);
		c.setCustName("Barath");
		c.setAddress("Bangalore");
		CustomerRepository repo=ctx.getBean(CustomerRepository.class);
		repo.addNewCustomer(c);
		System.out.println("SAVED !!!!");
	}

}
