package com.geeks.oops2;
public class InterfaceDemo {
public static void main(String[] args) {
	Drivable d=getCar("Swift"); 
	d.gear();//completly loose coupled with car
}
//assume its like a  car factory, if a customer asked a car thy gives it
static Drivable getCar(String car) {
	if (car.equals("Swift")) 
		return new Swift();//Swift IS A driving
	else return new Audi();
}
}
interface Drivable{
	void gear();//public abstract void gear();
}
class Swift implements Drivable{
	public void gear() {
		System.out.println("Swift car gear works");
	}
}
class Audi implements Drivable{
	public void gear() {
		System.out.println("Audi car gear works");

	}
}
