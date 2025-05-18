package com.example.demo.repository;

import org.springframework.stereotype.Component;

import com.example.demo.entity.Customer;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Component
public class CustomerRepository {
    @PersistenceContext
	private EntityManager em;
    @Transactional //begin and commit the transaction declaratively
    public void addNewCustomer(Customer c) {
    	//em.getTransaction().begin();
    	em.persist(c); //Saves the customer obj in table
    	//em.getTransaction().commit();
    }
}
