package com.java.core.functionalInterf;

public class Main {
	
	public static void main(String[] args) {
		
		Employee e = new Employee() {
			
			@Override
			public int getSalary(int salary) {
				// TODO Auto-generated method stub
				return salary*2;
			}
		};
		
		System.out.println(e.getSalary(25));
		
	}

}
