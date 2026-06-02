package com.java.core.exception.day3;

import java.io.FileNotFoundException;

public class Test {
	
	public static void main(String[] args) {
		
		int a = 12;
		
		if(a%2 == 0) {
			//even
			//arithmetic exception
			throw new ArithmeticException();
		}
		else {
			//odd
			System.out.println("This is good number");
		}
	}
	
	public void something() {
		
		int a = 12;
		int b = 2;
		int c = a/b;
		throw new ArithmeticException();
		
		
	}

}
