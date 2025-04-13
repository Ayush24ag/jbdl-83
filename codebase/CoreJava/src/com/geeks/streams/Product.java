package com.geeks.streams;


public class Product {
 private int productId;
 private String productName;
 private float price;
 private float ratings;
public Product(int productId, String productName, float price,float ratings) {
	super();
	this.productId = productId;
	this.productName = productName;
	this.price = price;
	this.ratings=ratings;
}


public float getRatings() {
	return ratings;
}


public void setRatings(float ratings) {
	this.ratings = ratings;
}


public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	//validation/security chk
	this.productId = productId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	if(price>=0)
		this.price = price;
}

public void print() {
	System.out.println("Product id "+productId);
	System.out.println("Price : "+price);
	System.out.println("Prod name : "+productName);
}

public String toString() {
	return productId+"\t"+ productName+"\t"+price+"\t"+ratings;
}
}
