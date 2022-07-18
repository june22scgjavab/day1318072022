package com.infosys.collection.demos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo8 {

	public static void main(String[] args) {
	List<String> stringList=new ArrayList<>();
	List<Integer> intList=new ArrayList<>();
    stringList.add("Zuben");
    stringList.add("Yamini");
    stringList.add("Abhinav");
    stringList.add("Shweta");
    System.out.println(stringList);
    Collections.sort(stringList);
    System.out.println(stringList);
    intList.add(20);
    intList.add(1);
    intList.add(23);
    intList.add(87);
    System.out.println(intList);
    Collections.sort(intList);
    System.out.println(intList);
	}

}
