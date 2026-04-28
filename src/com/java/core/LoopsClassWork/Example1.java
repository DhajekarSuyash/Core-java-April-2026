package com.java.core.LoopsClassWork;

public class Example1 {

	public static void main(String[] args) {
		// Q - find even numbers from 1 to 30
		/*
		 * 1. we need numbers from 1 to 30 
		 * 2. we need to find even numbers
		 * 
		 */
		//using for loop
		for (int i = 1; i <= 30; i++) {
			// check if 'i' is even or not
			if (i % 2 == 0) {
				
				// even number
				System.out.println(i);
			}
		}
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		
		// using while loop
		int i = 1;
		while(i <= 30) {
			
			if(i % 2 == 0 ) {
				System.out.println(i);
			}
			
		i++;	
		}
	} 

}
