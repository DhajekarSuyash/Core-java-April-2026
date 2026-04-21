package com.java.core.twoclass;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		// Requirement -> fname = John, lname = wick , yob = 1999
		// username -> Johnwick99

		// HOMEWORK -> Take fname, lname and yob dynamically using scanner

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter First name : ");
		String fname = sc.next();
		System.out.println("Enter Last name : ");
		String lname = sc.next();
		System.out.println("Enter age : ");
		int age = sc.nextInt();
		sc.close();

		UsernameGenerator generator = new UsernameGenerator();

		String username = generator.getUsername(fname, lname, age);

		System.out.println("Username is : " + username);

	}

}
