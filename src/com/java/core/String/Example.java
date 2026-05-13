package com.java.core.String;

public class Example {
	
	public static void main(String[] args) {
		
		String s = "TUESDAY";
		System.out.println(System.identityHashCode(s));
		
		
		
		
		
		String x =s.toLowerCase(); 
		System.out.println(System.identityHashCode(s));
	}

}
