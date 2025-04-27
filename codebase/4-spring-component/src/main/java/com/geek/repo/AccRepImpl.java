package com.geek.repo;

import org.springframework.stereotype.Component;

@Component
public class AccRepImpl  implements AccRep{
public AccRepImpl() {
	 System.out.println("constructor AccRepImpl");
}

@Override
public String credit(float amt) {
	return "The amount of "+amt+" credited in savings acc";
}
}
