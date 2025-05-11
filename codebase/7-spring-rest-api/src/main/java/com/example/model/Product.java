package com.example.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Product {
 private int prodId;
 @NotBlank(message = "please enter the prod name")
 private String prodName;
 @Min(value = 0,message = "prize cannot be negative")
 private float price;
 public Product() {
	// TODO Auto-generated constructor stub
}
 
public Product(int prodId, String prodName, float price) {
	super();
	this.prodId = prodId;
	this.prodName = prodName;
	this.price = price;
}

public int getProdId() {
	return prodId;
}
public void setProdId(int prodId) {
	this.prodId = prodId;
}
public String getProdName() {
	return prodName;
}
public void setProdName(String prodName) {
	this.prodName = prodName;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
 
 
}
