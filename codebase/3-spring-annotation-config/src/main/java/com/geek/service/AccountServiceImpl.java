package com.geek.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.geek.repo.AccRep;

public class AccountServiceImpl implements AccService {
private AccRep rep;
public AccountServiceImpl() {
	System.out.println("constructor AccountServiceImpl");
}
@Autowired
public void setRep(AccRep rep) {
	this.rep = rep;
	System.out.println("setter set Rep");
}
@Override
public String creditService(float amt) {
	return rep.credit(amt);
}

}
