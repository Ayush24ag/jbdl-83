package com.geeks.oops1;

public class OnlineShopApp {
public static void main(String[] args) {
	/*
	 * Assume these data pulled from the Database
	 */
	Book book=new Book();
	book.setProductId(101);
	book.setProductName("Java book");
	book.setAuthour("James Goslin");
	book.setGenre("Computers");
	book.setPrice(500);
	
	Mobile mobile=new Mobile();
	mobile.setProductId(102);
	mobile.setProductName("Samsung mobile");
	mobile.setCamera("Sony camera");
	mobile.setRamSize("16GB");
	mobile.setPrice(25000);
	/* store products in a array to store in the cart  */
	Product products[]= {mobile,book};
	float totPrice=0;
	/* to find the total price of items the items in the cart */
	for(Product p:products) { //for each loop ..iterates from 0th index to last index
		totPrice=totPrice+p.getPrice();
	}
	/* Creating cart instance and store the total price and cart items */
	Cart cart=new Cart();
	cart.setProducts(products);
	cart.setTotalPrice(totPrice);
	
	/* Creating customer instance and store customer data and cart instance  */
	Customer c=new Customer();
	c.setCustId(101);
	c.setCustName("Sanjay");
	c.setCart(cart);
	System.out.println("----All done ----");
	printData(c);
}
//Assume its UI
static void printData(Customer cust) {
	System.out.println("Customer name is "+cust.getCustName());
	System.out.println("Customer id is "+cust.getCustId());
	Cart cart=  cust.getCart();
	System.out.println("Total price is "+cart.getTotalPrice());
	System.out.println("***************************");
	System.out.println("___items in the cart___");
	Product items[]=cart.getProducts();
	for(Product p:items) {
		p.print();
		System.out.println("--------------------");
		//System.out.println(p.getProductId()+"  "+p.getProductName()+" "+p.getPrice());
		//System.out.println(p.getAuthour());
	}
	System.out.println("There are "+items.length+" items in the cart");
}
}
