package com.infosys.collection.demos;

// instanceof 
import java.util.ArrayList;

public class ArrayListDemo4 {

	public static void main(String[] args) {
		ArrayList objects=new ArrayList();
		objects.add("String");
		objects.add(10);
		objects.add(false);
		objects.add('A');
		for(Object obj : objects) {
		   if(obj instanceof String)
		   {
			   String str=(String)obj;
			   System.out.println(str);		  
		   }else if(obj instanceof Integer)
		   {
			   Integer intObj=(Integer)obj;
			   System.out.println(intObj);
		   }else if(obj instanceof Boolean)
		   {
			   Boolean boolObj=(Boolean)obj;
			   System.out.println(boolObj);
		   }else if(obj instanceof Character) {
			   Character charObj=(Character)obj;
			   System.out.println(charObj);
		   }
		   
		   
		
		}
		

	}

}
