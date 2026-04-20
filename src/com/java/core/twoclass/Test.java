package com.java.core.twoclass;

public class Test {
	
	public static void main(String[] args) {
		
		// Requirement -> fname = John, lname = wick , yob = 1999
		// username -> Johnwick99
		
	// HOMEWORK -> Take fname, lname and yob dynamically using scanner
		
		UsernameGenerator generator = new UsernameGenerator();
		
		String username = generator.getUsername("John", "Wick",1999);
		
		System.out.println("Username is : " + username);
	}
	
	

}
