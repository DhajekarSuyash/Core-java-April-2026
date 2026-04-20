package com.java.core.scanner;

import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {
		// Take input from console to java file
		Scanner sc = new Scanner(System.in);

		// 1. int as a input
		System.out.println("Please enter your year of birth : ");
		int yob = sc.nextInt();
		System.out.println("Input given is : " + yob);

		// 2. String as a input
		System.out.println("Enter city name : ");
		String city = sc.next();
		System.out.println("City is : " + city);
	}

}
