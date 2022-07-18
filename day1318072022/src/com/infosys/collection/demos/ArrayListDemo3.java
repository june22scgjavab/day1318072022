package com.infosys.collection.demos;

// instanceof 
import java.util.ArrayList;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		ArrayList objects=new ArrayList();
		objects.add("String");
		objects.add(10);
		objects.add(false);
		objects.add('A');
		for(Object obj : objects) {
		   
			System.out.println(obj);
		}
		

	}

}
