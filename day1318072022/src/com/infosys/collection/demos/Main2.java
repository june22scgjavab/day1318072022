package com.infosys.collection.demos;

public class Main2 {

	public static void main(String[] args) {
	     Vehicle vehicle=null;
	     Car car=new Car();
	     Bus bus=new Bus();
	     
	    vehicle=car;  // We are converting car into a Vehicle
	    if(vehicle instanceof Car) {
	    Car car1=(Car)vehicle;	
	    }
	    else
	    {
	    Bus bus1=(Bus)vehicle;
	    }
	    
	    
	    if(car instanceof Car)
	    {
	    	System.out.println("Yes");
	    }
	    if(car instanceof Object)
	    {
	    	System.out.println("Yes");
	    }
	   
	    
	    }
	 
	}


