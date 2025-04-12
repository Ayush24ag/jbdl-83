package com.geeks.oops2;

public class ConstructorDemo1 {
public static void main(String[] args) {
	new Stud();
}
}
class Parent{
	Parent(String s){
		System.out.println(s);
	}
}
class Child extends Parent{
	Child(){
		super("hello");
	}
}
class Person{
	Person(){
		System.out.println("Parent");
	}
}
class Stud extends Person {
	Stud(){
		//super(); //added by the compiler
		System.out.println("Child");
	}
}