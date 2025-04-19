package com.geeks.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetEx1 {
public static void main(String[] args) {
	/*
	 * HashSet - no duplicates
	 *         -no guaranty for order of elements
	 */
	HashSet<String> set1=new HashSet<>();
	set1.add("Alka");
	boolean b1=set1.add("Dev");
	set1.add("Adarsh");
	set1.add("Jeevan");
	set1.add("Kayathri");
	boolean b2=set1.add("Dev");
System.out.println(set1);
System.out.println(b1 +"  "+b2);

/*
 * TreeSet -- No duplicates
 *         -- Elements arranged in sorted order
 */
TreeSet<String> set2=new TreeSet<>();
set2.add("Alka");
 b1=set2.add("Dev");
 set2.add("Adarsh");
 set2.add("Jeevan");
 set2.add("Kayathri");
 b2=set2.add("Dev");
System.out.println(set2);
System.out.println(b1 +"  "+b2);


/*
 * 
 * LinkedHashSet - no duplicates 
 *               -elements arranged in insertion order
 */
LinkedHashSet<String> set3=new LinkedHashSet<>();
set3.add("Alka");
b1=set3.add("Dev");
set3.add("Adarsh");
set3.add("Jeevan");
set3.add("Kayathri");
b2=set3.add("Dev");
System.out.println(set3);
System.out.println(b1 +"  "+b2);
}
}
