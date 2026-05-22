package com.java.core.poly.runtime;

public class HR extends Employee {

	int a = 23;
	
	public HR() {
	//construct do not override	
	}
	
	
	//overridden method
	@Override
	public void printSalary() {
	System.out.println("HR : 2000" );
	}


	@Override
	public void get(int a) {
		
	}
	
	
	
}
