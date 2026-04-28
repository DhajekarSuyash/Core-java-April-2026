package com.java.core.LoopsClassWork;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		/* addition using scanner */
		
		// addition is always running
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Please eneter a ->");
			int a = sc.nextInt();
			System.out.println("Please eneter b ->");
			int b = sc.nextInt();

			int sum = a + b;
			System.out.println("Addition is : " + sum);
			System.out.println("-----------------");

		}

	}

}
