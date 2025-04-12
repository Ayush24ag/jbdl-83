package com.geeks.collections;

public class SimpleLambdaDemo1 {

	public static void main(String[] args) {
	 //Create a Lammbda for Greeting interface
	//call postWishes fn
	}
	
	static void postWishes(Greeting g,String name) {
		System.out.println(g.wish(name));
	}
}

interface Greeting{
	String wish(String name);
}