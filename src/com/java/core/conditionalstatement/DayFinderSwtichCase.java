package com.java.core.conditionalstatement;

import java.util.Scanner;

public class DayFinderSwtichCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.err.println("Enter a number between 1 to 7");
		int input = sc.nextInt();

		switch (input) {
		case 1: {
			System.out.println("MONDAY");
			break;
		}
		case 2: {
			System.out.println("TUESDAY");
			break;
		}
		case 3: {
			System.out.println("WEDNESDAY");
			break;
		}
		case 4: {
			System.out.println("THURSEDAY");
			break;
		}
		case 5: {
			System.out.println("FRIDAY");
			break;
		}
		case 6: {
			System.out.println("SATURDAY");
			break;
		}
		case 7: {
			System.out.println("SUNDAY");
			break;
		}
		default: {
			System.out.println("ENTER PROPER NUMBER");
		}

		}

	}

}
