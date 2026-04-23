package com.java.core.conditionalstatement;

import java.util.Scanner;

public class ladderifCondition {

	//if-else-if
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number between 0 to 6");
		
		int a = sc.nextInt();
		sc.close();
		// we need to print a number in words eg ip = 5 then op = five

		// when u need to compare more than once then use ladder if

		if (a == 1) {
			System.out.println("One");
		} 
		else if (a == 2) {
			System.out.println("Two");
		} 
		else if (a == 3) {
			System.out.println("Three");
		} 
		else if (a == 4) {
			System.out.println("Four");
		} 
		else if (a == 5) {
			System.out.println("Five");
		}
		else {
			System.out.println("Entered number should be less than 6 and more than 0");
		}

	}

}
