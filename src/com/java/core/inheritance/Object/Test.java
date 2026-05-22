package com.java.core.inheritance.Object;

public class Test {
	public static void main(String[] args) {
		
	Employee e = new HR();
	
	System.out.println(e.a);
	System.out.println(e.b);
	System.out.println(e.age);
	// all variable from parent
	
	System.out.println("********");
		e.m1();
		e.m2();
	}
	
	

}
