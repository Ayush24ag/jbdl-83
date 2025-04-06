package com.geeks.oops1;

public class Mobile extends Product {
private String camera;
private String ramSize;
public String getCamera() {
	return camera;
}
public void setCamera(String camera) {
	this.camera = camera;
}
public String getRamSize() {
	return ramSize;
}
public void setRamSize(String ramSize) {
	this.ramSize = ramSize;
}
public void print() {
	super.print();
	System.out.println("Camera : "+camera);
	System.out.println("Memory : "+ramSize);
}
}
