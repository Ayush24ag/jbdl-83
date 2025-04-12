package com.geeks.collections;

import java.util.ArrayList;
import java.util.List;

public class ListEx1 {
public static void main(String[] args) {
	//ArrayList --> provides dynamic array 
	//            -->creates a array of size 10
	List<String> list1= new ArrayList<>();
	list1.add("Bangalore");
	list1.add("Mumbai");
	list1.add("Delhi");
	System.out.println(list1);
	for(String s:list1) {
		System.out.println(s);
	}
	list1.add(1,"Chennai"); //adding by index
	System.out.println(list1);
	list1.set(0, "Bengaluru");//for update
	System.out.println(list1);

}
}
