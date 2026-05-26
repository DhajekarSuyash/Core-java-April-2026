package com.java.core.abstraction;

public class Test {
	public static void main(String[] args) {

		int salary = 10000;

		Employee e;

		e = new Developer();
		e.giveSalary(salary);

//		e = new HR();
//		e.giveSalary(salary);

		Employee suyash = new Employee() {

			@Override
			public void giveSalary(int salary) {
				System.out.println(salary);

			}

			@Override
			public void getName() {
				// TODO Auto-generated method stub
				System.out.println("SUYASH");
			}
		};
		
		suyash.getName();
		suyash.giveSalary(50000);
	}
}
