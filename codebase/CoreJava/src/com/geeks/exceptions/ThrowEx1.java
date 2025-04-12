package com.geeks.exceptions;

import java.util.Scanner;

public class ThrowEx1 {
public static void main(String[] args) {
	//throw --> used to throw exception manually 
	float bankBal=5000;
	System.out.println("Welcome to ATM App");
	Scanner scanner= new Scanner(System.in);
	System.out.println("Dear customer, enter the amt to withdraw");
	float amt=scanner.nextFloat();
	if(amt<bankBal) {
		bankBal=bankBal-amt;
		System.out.println(" transaction Success and bal is "+bankBal);
	}
	else {
			throw new InSufficientFundsException();
	}
}
}
