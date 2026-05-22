package com.java.core.poly.runtime;

//polymorphism -> many + forms;
//overriding
public class Employee {
	
	int a = 12;
	
	public Employee() {
		
	}
	
	public void printSalary() {
		System.out.println("Salary of employee ");
	}
	
	public void get(int a) {
		
	}
	
	
	public static void printAge() {
		System.out.println("Age");
//static method do not override
	}
	
	private void m1(int a ) {
		System.out.println("m1");
// DO not override
	}
	
}

//overload vs override

//inheritance vs overriding?