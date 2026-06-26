package com.java.core.singlethreading;

public class Test {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread());
		System.out.println("Code started");
		
		Student s = new Student();
		s.printName();
		
		System.out.println("Code ended"); 
		
		System.out.println(Thread.currentThread());
		
		
	}
}
