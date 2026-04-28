package com.java.core.LoopsClassWork;

import java.util.Scanner;

public class Example2 {
	
	// Q -> print table by taking user inputs
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please eneter a number to get table");
		int input = sc.nextInt();
		sc.close();
		
		// consider input = 5
		// as table has 10 numbers so we want numbers from 1 to 10
		
		System.out.println("Table of "+ input +" is as follow - ");
		for(int i = 1 ; i <= 10 ;  i++) {
			System.out.println( i +" x "+ input+ " = "+ i * input);
		}
		
		
		
	}

}
