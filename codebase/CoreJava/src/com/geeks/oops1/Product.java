package com.geeks.oops1;
public class Product {
 private int productId;
 private String productName;
 private float price;
 
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



}
