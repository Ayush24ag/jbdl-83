package com.geek;
public class GreetingBean {
	private String msg;
public GreetingBean() {
System.out.println("Greeting bean constructed");
}
public void setMsg1(String msg) {
	this.msg=msg;
	System.out.println("setter called....");
}
public String sayHello(String name) {
	return "Hello "+name+" "+msg;
}
}
