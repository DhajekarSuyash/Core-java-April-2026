package com.java.core.optional;

import java.lang.StackWalker.Option;
import java.util.Optional;

public class TestOptional {
	
	public static void main(String[] args) {
		// Case -1 , we are sure there will be no null value
		
		String firstName = "Shubham";
		System.out.println(firstName);
		
		Optional<String> optionalFName =  Optional.of(firstName);
		System.out.println(optionalFName);
		
		// Case - 2 , There is possibility of null value
		
		String city = null;
		System.out.println("City : " +city);
		
		Optional<String> optionalCity = Optional.ofNullable(city);
		System.out.println(optionalCity);
		
		
		
	}

}
