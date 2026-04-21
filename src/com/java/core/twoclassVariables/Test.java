package com.java.core.twoclassVariables;

public class Test {

	public static void main(String[] args) {

		Student s = new Student();
		s.id = 101;
		s.name = "Ram";
		s.city = "Pune";
		
		Student s1 = new Student();
		s1.id = 102;
		s1.name = "SHAM";
		s1.city = "DELHI";
		
		
		
		System.out.println(s);
		
		
		
		
		
		System.out.println(s.id);
		System.out.println(s.name);
		System.out.println(s.city);
	}

}
