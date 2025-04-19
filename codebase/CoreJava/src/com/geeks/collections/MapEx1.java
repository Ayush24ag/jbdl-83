package com.geeks.collections;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class MapEx1 {
public static void main(String[] args) {
	HashMap<String, String> map1=new HashMap<>();
	map1.put("E-101", "Arun");
	map1.put("E-102", "Balu");
	map1.put("E-103", "Karthik");
	map1.put("E-104", "Sanjay");
	map1.put("E-101", "Arun");
	System.out.println(map1);
	map1.put("E-101", "Arun Kumar"); //it overwrites
	System.out.println(map1);
	
	System.out.println("Searching a element in map by key");
	String name=map1.get("E-104");//timing complexity O(1)
	System.out.println(name);
	//Map is not iterable in default 
  Set<String>	keys=  map1.keySet(); //returns view of keys
  for(String k:keys) {
	  System.out.println(k);
  }
  System.out.println("----Names ----");
 Collection<String> names=   map1.values();
 for(String n:names) {
	 System.out.println(n);
 }
 
  Set<Map.Entry<String, String>> rows= map1.entrySet();
  System.out.println("--------------------------");
  for(Map.Entry<String, String> record:rows) {
	  String k=record.getKey();
	  String v=record.getValue();
	  System.out.println(k +"   "+v);
  }
}
}
