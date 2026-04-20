package com.java.core.scanner;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter value of a : ");
		
		int a = sc.nextInt();
		
		System.out.println("Enter value of b : ");
		int b = sc.nextInt();
		
		int sum  = a + b;
		System.out.println("Sum is : " +sum);
		
		int sub = a - b;
		System.out.println("Substraction is : " + sub);
	}

}
