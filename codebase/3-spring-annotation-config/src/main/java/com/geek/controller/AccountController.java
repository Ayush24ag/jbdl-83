package com.geek.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.geek.service.AccService;

public class AccountController {
	public AccountController() {
		 System.out.println("Acc Controller constructor");
	}
	@Autowired
private AccService service;

public void setService(AccService service) {
	this.service = service;
	System.out.println("setter acc service");
}

public String creditSal(float amt) {
	return service.creditService(amt);
}
}
