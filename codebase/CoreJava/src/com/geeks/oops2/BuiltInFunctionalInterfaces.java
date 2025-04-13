package com.geeks.oops2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.geeks.collections.Product;
public class BuiltInFunctionalInterfaces {
public static void main(String[] args) {
	Product p1= new Product(101, "Mobile", 10000,4.5f);
	Product p2= new Product(102, "T Shirt", 1000,4.6f);
	Product p3= new Product(103, "Jeans", 2000,4.2f);
	Product p4= new Product(104, "Bottle", 200,3.9f);
	Product p5= new Product(105, "Laptop", 50000,4.9f);
	ArrayList<Product> plist=new ArrayList<>();
	plist.add(p1);
	plist.add(p2);
	plist.add(p3);
	plist.add(p4);
	plist.add(p5);
	//remove element from the list based on condition
	//Eg. remove the products if the price more than 10000
//	Predicate<Product> predicate=(Product p)->{return p.getPrice()>10000;};
	//Predicate<Product> predicate=(p)->{return p.getPrice()>10000;};
	//Predicate<Product> predicate=p->{return p.getPrice()>10000;};
	
	Predicate<Product> predicate=p->p.getPrice()>10000;
	plist.removeIf(predicate);
	 // plist.removeIf(p->p.getRatings()<4);
	System.out.println("***Item removed***");
	System.out.println(plist);
	System.out.println("********************");
	Consumer<Product> consumer=(p)->{int x=10;System.out.println(p);};
	plist.forEach(consumer);
	
	//sort the collection based on price or ratings
	//Collections.sort(plist, new SortByPrice());
	//Comparator<Product> compare=(Product o1, Product o2) -> {
	//	return o1.getPrice()<o2.getPrice()?-1:1;
	//};
	Comparator<Product> compare=(o1,o2)->  o1.getPrice()<o2.getPrice()?-1:1;
	Collections.sort(plist,compare);
	System.out.println("**After sorting**");
	plist.forEach(p->System.out.println(p));
}
}
/*
class SortByPrice implements Comparator<Product>{
    //returns -ve , +ve
	public int compare(Product o1, Product o2) {
		System.out.println(o1.getProductName()+" and "+o2.getProductName());
		return o1.getPrice()<o2.getPrice()?-1:1;
	}
}*/
