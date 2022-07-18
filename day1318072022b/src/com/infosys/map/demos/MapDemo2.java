package com.infosys.map.demos;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {

	public static void main(String[] args) {
	Map<String, Integer> books = new HashMap<String, Integer>();
		
		//Adding key-value pairs to the map
		books.put("Data Structures With Java", 50);
		books.put("Operating System", 80);
		books.put("Let Us C", 70);
		books.put("Java Fundamentals", 40);
		
		//Displaying all the key-value pairs present in the map
		System.out.println(books);
		System.out.println(books.size());
		System.out.println(books.containsKey("Let Us C"));
		System.out.println(books.containsValue(70));
	
		System.out.println(books.get("Java Fundamentals"));
		int val=books.get("Java Fundamentals");
		System.out.println(val);
		Set<String> keys=books.keySet();
		System.out.println("The details");
		System.out.println(keys);
		for(String key : keys) {
			System.out.println(key+" "+books.get(key));
		}
	   System.out.println("The second way to traverse");
	    Set<Map.Entry<String,Integer>> entries=books.entrySet();
	    for(Map.Entry<String, Integer>  entry: entries) {
	    	System.out.println(entry.getKey()+"\t"+entry.getValue());
	    }
	 
	
	}

}
