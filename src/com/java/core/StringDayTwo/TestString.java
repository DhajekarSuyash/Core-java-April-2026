package com.java.core.StringDayTwo;

public class TestString {
	
	public static void main(String[] args) {
		// using literals
		String s = "Irise";
		//using new keyword
		String s1 = new String("Irise");
		
		String s2 = "Irise";
		String s3 = new String("Irise");
		
		System.out.println("s : " +System.identityHashCode(s));
		System.out.println("s1 : " +System.identityHashCode(s1));
		System.out.println("s2 : " +System.identityHashCode(s2));
		System.out.println("s3 : " +System.identityHashCode(s3));
		
		
		System.out.println("====================");
		System.out.println(s.equals(s1));
		System.out.println(s.equals(s2));
		System.out.println(s.equals(s3));
		
		System.out.println("====================");
		//a == b
		System.out.println(s == s1); // false
		System.out.println(s == s2); //true
		System.out.println(s1 == s3); // false
		
	}

}
