package com.geek.service;

import com.geek.repo.AccRep;

public class AccountServiceImpl implements AccService {
private AccRep rep;
public AccountServiceImpl() {
	System.out.println("constructor AccountServiceImpl");
}
public void setRep(AccRep rep) {
	this.rep = rep;
	System.out.println("setter set Rep");
}

}
