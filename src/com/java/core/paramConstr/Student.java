package com.java.core.paramConstr;

public class Student {
	
	public String name;
	
	public int age;
	
	public Student(String name, int age) {
		this.name = name;
		this.age=age;
	}
	
	
	
	public void printName() {
		System.out.println("Name is : " +name);
		System.out.println(age);
	}

}
