package com.java.core.exception;

import java.util.Scanner;

public class ExceptionBasics2 {

	public static void main(String[] args) {

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a : ");

			int a = sc.nextInt();

			System.out.println("Enter b : ");
			int b = sc.nextInt();
			
			//try-catch 12,0
			try {
				// code which can cause an exception
				System.out.println("Division : " + (a / b));
			}
			catch(ArithmeticException e) {
				System.out.println("Please do not enter b = 0 ");
			}
			System.out.println("=================================================");

		}

	}

}
