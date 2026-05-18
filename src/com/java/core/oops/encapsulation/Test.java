package com.java.core.oops.encapsulation;

public class Test {
	
	public static void main(String[] args) {
		
		Instagram i = new Instagram();
		//i.username = "cccc";
		i.password = "xyz";
		
		i.setUsername("Apple");
		String username = i.getUsername();
		System.out.println(username);
	}

}
