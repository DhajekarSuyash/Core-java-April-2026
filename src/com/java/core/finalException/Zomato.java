package com.java.core.finalException;

public class Zomato {
	
	public static void orederFood(String city)  {
		
		String currentCity = "PUNE";
		
		System.out.println("select");
		if(!city.equalsIgnoreCase(currentCity)) {
			//next flow should not occur
			throw new InvalidCityException("Exception occured");
			
		}
		
		System.out.println("quantity");
		System.out.println("Address");
		System.out.println("Payment");
		System.out.println("status");
		
	}
	

}
