package com.example.demo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Customer;
import com.example.demo.service.CustomerService;
@RestController
@RequestMapping("/customers")
public class CustomerApi {
	@Autowired
private CustomerService service;
	@PostMapping
	public Customer addNewCustomer(@RequestBody  Customer c) {
		return service.addNewCustomer(c);
	}
	@GetMapping("/{id}")
	public Customer getCustomer(@PathVariable("id")  int id) {
		System.out.println("connecting with DB ....");
		return  service.getCustomer(id);
	}
}
