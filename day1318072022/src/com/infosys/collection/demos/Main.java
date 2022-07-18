package com.infosys.collection.demos;

public class Main {

	public static void main(String[] args) {
	     Vehicle vehicle=null;
	     Car car=new Car();
	     Bus bus=new Bus();
	     
	    vehicle=car;  // We are converting car into a Vehicle
	    
	    Bus bus1=(Bus)vehicle;  // typecasting but a wrong typecasting 
	// java.lang.ClassCastException: class com.infosys.collection.demos.Car cannot be cast to class com.infosys.collection.demos.Bus
	
	}

}
