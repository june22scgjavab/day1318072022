package com.infosys.collection.demos;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo7 {

	public static void main(String[] args) {
		List<String> names=new ArrayList<>();
		names.add("Ram");
		names.add("Shayam");
		names.add("Jagan");
		names.add("Suresh");
		System.out.println("Before the insert in second position");
		System.out.println(names);
		names.add(2,"Infosys");
		System.out.println("After insert in the second position");
		System.out.println(names);
		

	}

}
