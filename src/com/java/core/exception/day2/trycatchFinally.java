package com.java.core.exception.day2;

import java.util.Scanner;

public class trycatchFinally {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a : ");
		int a = sc.nextInt();
		System.out.println("Enter b : ");
		int b = sc.nextInt();
		
		try {
			System.out.println(a/b);
			
		} catch (ArithmeticException e) {
			System.out.println("exception occured");
			
		}
		finally {
			sc.close();
		}
	
	}

}
