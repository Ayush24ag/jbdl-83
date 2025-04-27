package com.geek.controller;

import com.geek.service.AccService;

public class AccountController {
	public AccountController() {
		 System.out.println("Acc Controller constructor");
	}
private AccService service;
public void setService(AccService service) {
	this.service = service;
	System.out.println("setter acc service");
}

public String creditSal(float amt) {
	return service.creditService(amt);
}
}
