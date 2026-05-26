package com.java.core.abstraction;

public class Developer extends Employee
{

	@Override
	public void getName() {
		// TODO Auto-generated method stub
	System.out.println("DEVELOPER");	
	}

	@Override
	public void giveSalary(int salary) {
		salary = salary * 10;
		System.out.println("Dev salary" + salary);
	}

	

}
