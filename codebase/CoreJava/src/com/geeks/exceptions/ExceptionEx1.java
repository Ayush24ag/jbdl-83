package com.geeks.exceptions;

public class ExceptionEx1 {
public static void main(String[] args) {
	int a=10;
	int b=5;
	int c=2;
	int r=0;
	try {
			System.out.println("**Calculation**");
			r=a/(b*c-a);//pgm stops here .....
			System.out.println(r);
			System.out.println("End try");
	}
	catch(ArithmeticException e) {
		System.out.println("In catch 1");
	}
	catch(Exception e) {
		System.out.println("**in catch 2**");
	}
	System.out.println("END");
}
}
