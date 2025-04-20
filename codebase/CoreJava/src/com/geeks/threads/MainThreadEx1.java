package com.geeks.threads;

public class MainThreadEx1 {
public static void main(String[] args) throws InterruptedException {
	System.out.println("Hello");
	//System.out.println(5/0);
	Thread t=Thread.currentThread();//returns current running thread ref
	System.out.println("Current running thread is "+t.getName());
	System.out.println("priority :  "+t.getPriority());
	t.setName("April");
	t.setPriority(10); //from 1 (min) to 10 (max)
	System.out.println(t.getName());
	System.out.println(t.getPriority());
	for(int i=1;i<=10;i++) {
		Thread.sleep(1000);
		System.out.println(i);
	}
}
}


