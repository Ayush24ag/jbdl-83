package com.geeks.collections;
import java.util.ArrayList;
public class LambdaMotivation {
public static void main(String[] args) {
	Product p1= new Product(101, "Mobile", 10000,4.5f);
	Product p2= new Product(102, "T Shirt", 1000,4.6f);
	Product p3= new Product(103, "JEans", 2000,4.2f);
	Product p4= new Product(104, "Bottle", 200,3.9f);
	Product p5= new Product(105, "Laptop", 50000,4.9f);
	ArrayList<Product> plist=new ArrayList<>();
	plist.add(p1);
	plist.add(p2);
	plist.add(p3);
	plist.add(p4);
	plist.add(p5);
	ProductFilter filter=(Product p)->{return p.getRatings()>=4;};
	
	filterAndDisplay(plist, filter);
	ProductFilter f1=p->p.getPrice()<=10000;
	System.out.println("------------------");
	filterAndDisplay(plist, f1);
	System.out.println("-------------");
	filterAndDisplay(plist, p->p.getPrice()>10000);
}
static void filterAndDisplay(ArrayList<Product> plist,ProductFilter filter) {
	for(Product p:plist) {
	if(filter.test(p)) { //pure polymorphism ....
			System.out.println(p);
		}
	}
}
}
/*
class FilterByPrice implements ProductFilter{
	public boolean test(Product p) {
		return p.getPrice()<=10000;
	}
}
class FilterByRatings implements ProductFilter{
	public boolean test(Product p) {
		return p.getRatings()>=4;
	}
}
*/