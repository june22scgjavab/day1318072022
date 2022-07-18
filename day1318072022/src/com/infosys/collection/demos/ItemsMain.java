package com.infosys.collection.demos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ItemsMain {

	public static void main(String[] args) {
	
		List<Items> itemList=new ArrayList<>();
        itemList.add(new Items(1,"Pen",50.0f));
        itemList.add(new Items(3,"Paper",150.20f));
        itemList.add(new Items(2,"Copy",67.0f));
        //Collections.sort(itemList);
        // In the code above it is not possible to know in which field we want to Sort
        System.out.println("Before sort");
        for(Items item : itemList)
        {
        	//System.out.println(item.getId()+"\t"+item.getDescription()+"\t"+item.getItemPrice());
        	System.out.println(item.toString());
        }
        
        Collections.sort(itemList);
        System.out.println("After sort");
        for(Items item : itemList)
        {
        	//System.out.println(item.getId()+"\t"+item.getDescription()+"\t"+item.getItemPrice());
        	System.out.println(item);
        }
        
	}

}
