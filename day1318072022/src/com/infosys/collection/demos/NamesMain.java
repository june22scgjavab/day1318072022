package com.infosys.collection.demos;

import java.util.ArrayList;
import java.util.List;

public class NamesMain {

	public static void main(String[] args) {
		//ArrayList<String> names=new ArrayList<String>();
		List<String> names=new ArrayList<String>();
	    NamesDAO namesDAO=new NamesDAO();
		names.add("Rohit");
	    names.add("Shital");
	    names.add("Gurpreet");
	    namesDAO.setNames(names);
	    names=namesDAO.getNames();
	    for(String name : names)
	    {
	    	System.out.println(name);
	    }
	    
	}

}
