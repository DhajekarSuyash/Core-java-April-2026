package com.java.core.LoopsClassWork;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// this while loop will be always true
		
		while(true) {
			System.out.println("Please enter a name : ");
			String name = sc.next();
			System.out.println("Entered name is : " + name);
		}

	}

}
