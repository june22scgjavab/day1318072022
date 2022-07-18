package com.infosys.set.demos;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemos {
// boolean add(String str);
	public static void main(String[] args) {
		System.out.println("HashSet");
		Set<String> names=new HashSet<String>();
        System.out.println(names.add("Ritu"));
        System.out.println(names.add("Ahmed"));
        System.out.println(names.add("Zeorge"));
        System.out.println(names.add("Ahmed"));
      
        System.out.println(names);
        System.out.println("LinkedHashSet");
        names=new LinkedHashSet<String>();
        System.out.println(names.add("Ritu"));
        System.out.println(names.add("Ahmed"));
        System.out.println(names.add("Zeorge"));
        System.out.println(names.add("Ahmed"));
        
        System.out.println(names);
        System.out.println("TreeSet");
        names=new TreeSet<String>();
        System.out.println(names.add("Ritu"));
        System.out.println(names.add("Ahmed"));
        System.out.println(names.add("Zeorge"));
        System.out.println(names.add("Ahmed"));

        System.out.println(names);
      
        
        
	}

}
