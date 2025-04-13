package com.geeks.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

import com.geeks.collections.Product;

public class StreamDemo1 {
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
	
	plist.stream().filter(p->p.getRatings()>=4).
	forEach(p->System.out.println(p));
	System.out.println("----------filtered and sorted----------");
	plist.stream().filter(p->p.getRatings()>=4).
	sorted((o1,o2)->o1.getPrice()<o2.getPrice()?-1:1).forEach(p->System.out.println(p));
	
	System.out.println("----costliest product----");
	Product maxProduct=
	plist.stream().max((o1,o2)->o1.getPrice()<o2.getPrice()?-1:1).get();
	System.out.println("Costliest product is "+maxProduct);
	
	Product cheapestProduct=
			plist.stream().min((o1,o2)->o1.getPrice()<o2.getPrice()?-1:1).get();
			System.out.println("cheapestProduct product is "+cheapestProduct);
	
			//filter & sorted & store the result in a diff list
			//streams wont modify the source
		List<Product> sortedList=	
			plist.stream().filter(p->p.getRatings()>=4).
			sorted((o1,o2)->o1.getPrice()<o2.getPrice()?-1:1).toList();
		
		
	//filter the products ratings >=4 and sort & display
	//find the costliest product (use max method)
	//find the cheapest product (use min method)
	//find the lowest rated product
	//find the highest rated product
	
	
//    Stream<Product> stream1=plist.stream();
//    Predicate<Product> predicate=p->p.getRatings()>=4;
//    Stream<Product> stream2= stream1.filter(predicate);
//   Consumer<Product> consumer=(p)->System.out.println(p);
//   stream2.forEach(consumer);
}
}
