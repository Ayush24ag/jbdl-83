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
    	//Managed state
    	em.persist(c); //Saves the customer obj in table
    	c.setAddress("Pune"); //managed state
    }//commit
    public void searchById(int cid) {
    	//manged state
    	Customer c=em.find(Customer.class, cid);
    	if(c!=null) {
    		System.out.println(c.getCustName()+" "+c.getAddress());
    	}
    	else {
    		System.out.println("Customer not exists");
    	}
    }
    @Transactional
    //start the transaction
    public void updateAddress(int cid, String newAddress) {
    	//persistent/managed
    	Customer c=em.find(Customer.class, cid);
    	if(c!=null) {
    		c.setAddress(newAddress);
    		//reload from DB
    		//em.refresh(c);//discard in memory changes & reload frm DB
    	}
    	else
    		System.out.println("record not exists");
    } //commit the transaction
}
