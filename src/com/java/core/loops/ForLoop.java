package com.java.core.loops;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		// 1. initialization
		// 2. condition
		// 3. incr/decr
		System.out.println("start");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		

		for (int i = 0; i < input; i++) {
			System.out.println(i);
		}

		System.out.println("END");

		for (int i = 5; i > 0; i--) {
			System.out.println(i);
		}

		for (int i = 0; i >= 0; i++) {
			System.out.println("infinite");
		}
	}
}
