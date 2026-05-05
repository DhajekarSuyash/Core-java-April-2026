package com.java.core.parameterisedConstructor;

public class Employee {
	//global/instance variable
	int age = 12;
	
	public Employee() {
		System.out.println("In Employee Constructor");
	}
	
	public void printName() {
		//local variable
		String name = "Akash";
		System.out.println(name);
		System.out.println(age);
		
	}
	
	public void printNameAgain() {
		System.out.println(age);
	}
	
	

}
