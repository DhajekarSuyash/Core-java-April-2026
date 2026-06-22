package com.java.core.optional;

import java.util.Optional;

public class Test2 {
	
	public static void main(String[] args) {
		// s- gift
		String s = null;
		System.out.println(s);
		
		// wrap s to giftbox -> make it optional
		Optional<String> optionalS = Optional.ofNullable(s);
		//risky way
		//System.out.println(optionalS.get());
		
		// safe way -> what if s == null
		// we need to avoid nullpointer so use OPtional
		
		System.out.println(optionalS.orElse("IRISE"));
		System.out.println("Important code");
		
		
		
	}

}
