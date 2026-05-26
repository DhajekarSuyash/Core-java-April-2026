package com.java.core.abstraction;

public class HR extends Employee{

	@Override
	public void getName() {
		// TODO Auto-generated method stub
		System.out.println("HR");
	}

	@Override
	public void giveSalary(int salary) {
		salary = salary / 10;
		System.out.println("HR salary" + salary);
	}

}
