package com.java.core.staticKeyword;

public class TestStatic {
	
	public static void main(String[] args) {
		
		System.out.println(Student.name);
		Student.printAge();
		
		
		System.out.println("---------------");
		Student s = new Student();
		
		Student st; // class load -> only static things loaded
		st= new Student(); // object create -> non-static loaded
		
		int x; //  declaration
		x=12; //intitalization
		
		System.out.println(s.name);
		
		System.out.println(Student.name);
		Student.printAge();
	}

}
