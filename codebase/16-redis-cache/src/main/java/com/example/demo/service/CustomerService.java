package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Customer;
import com.example.demo.repo.CustomerRepository;

@Component
public class CustomerService {
	@Autowired
	private CustomerRepository custRepo;
	@CachePut(key = "#root.args[0].id", value = "customer")
	public Customer addNewCustomer( Customer c) {
	    return custRepo.save(c);
	}

	@Cacheable(value = "customer",key = "#root.args[0]")
	public Customer getCustomer(int id) {
		System.out.println("connecting with DB ....");
		//check in the cache
		   //if its available read & return it
		//if its not available read from DB & store in the cache & return it
		return  custRepo.findById(id).get();
	}
	
}
