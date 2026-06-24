package com.java.core.optional;

import java.util.Optional;

public class TestOptional2 {

	public static void main(String[] args) {
		
		String name = null;
		
//		if(name != null) {
//			System.out.println(name.toUpperCase());
//		}
		
		Optional<String> nameOpt = Optional.ofNullable(name);
		
		// default value
		//String nameFromOptional = nameOpt.orElse("abhishek");
		
		try {
			String nameFromOptional = nameOpt
					.orElseThrow(() -> new NullPointerException("name cant be null") );
		} catch (Exception e) {
			System.out.println("ExceptionHandled" + e);
		}
		
		
		System.out.println("Important code");
		
	}
}
