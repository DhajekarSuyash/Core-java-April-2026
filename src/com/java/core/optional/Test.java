package com.java.core.optional;

import java.util.Optional;

public class Test {
	
	public static void main(String[] args) {
		
		
		Integer a = 12;
		// a =- gift (PEN)
		//optionalA = giftBox  = Optional[12]
		
		//to make it optional/ pack it in gift
		Optional<Integer> optionalA = Optional.of(a);
		
		
		System.out.println(a);
		System.out.println(optionalA);
		// to take out value from optional
		System.out.println(optionalA.get());
	
	}

}
