package com.java.core.superthis;

public class HR extends Employee {

	public HR() {
		System.out.println("HR CONstr");
		super.getAge();
		System.out.println(super.name);
		this.getAge();
		System.out.println(this.age);
	}
	
	
	
	public int age = 4000;

	public void getAge() {
		System.out.println("700");
	}

	public void something() {
		
		System.out.println("something called");
		System.out.println(this.age);
		System.out.println(super.age);
		System.out.println(super.name);
		this.getAge();
		super.getAge();
	}
}
