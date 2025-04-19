package com.geeks.collections;
import java.util.ArrayList;
import java.util.LinkedList;
public class ListExample {
public static void main(String[] args) {
	
	ArrayList<String> list1=new ArrayList<>();
	long t1=  System.currentTimeMillis();
	for(int i=1;i<=1000000;i++) {
		list1.add("hello");
	}
	long t2=  System.currentTimeMillis();
	System.out.println("Time took for arraylist "+(t2-t1));
	
	LinkedList<String>list2=new LinkedList<>();
	 t1=  System.currentTimeMillis();
	for(int i=1;i<=1000000;i++) {
		list2.add("hello");
	}
	t2=  System.currentTimeMillis();
	System.out.println("Time took for LinkedList "+(t2-t1));

}
}
