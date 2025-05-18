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
		CustomerRepository repo=ctx.getBean(CustomerRepository.class);
	  /*Customer c=new Customer();//NEW
	  c.setCustId(107);
		c.setCustName("Rajat");
		c.setAddress("Delhi");
		
		repo.addNewCustomer(c);
		//DETACHED
		c.setAddress("Chennai");
		System.out.println("SAVED !!!!");
		//repo.searchById(110);
		 * */
		repo.updateAddress(102, "Delhi");
		}

}
