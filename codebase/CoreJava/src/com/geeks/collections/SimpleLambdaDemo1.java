package com.geeks.collections;

public class SimpleLambdaDemo1 {

	public static void main(String[] args) {
	 //Create a Lammbda for Greeting interface
	//call postWishes fn
		Greeting g1=(String name)->{return "Hello "+name;};
		postWishes(g1, "Albin");
		Greeting g2=(n)->{return "Hello "+n;};
		Greeting g3=n->{return "Hello "+n;};
		Greeting g4=n-> "Hello "+n;
		postWishes(g4, "Albin");
		postWishes(n->"Hello GA "+n, "JBDL83 batch");
	}
	static void postWishes(Greeting g,String name) {
		System.out.println(g.wish(name));
	}
}
@FunctionalInterface //this annotation makes more readable & it ensure it must have only one abstract method
interface Greeting{ //Functional interfaces --> the interface which must one and only abstract method
	String wish(String name);
	//void f1();
}