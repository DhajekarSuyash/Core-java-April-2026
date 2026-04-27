package com.java.core.loops;

public class ForLoop {

	public static void main(String[] args) {
		// 1. initialization
		//2. condition
		// 3. incr/decr
		System.out.println("start");
		
		for(int i = 0 ; i < 5 ; i++ ) {
			System.out.println( i);
		}
		System.out.println("END");
		
		for(int i = 5 ; i > 0; i--) {
			System.out.println(i);
		}
		
		for (int i = 0 ; i >= 0 ; i ++) {
			System.out.println("infinite");
		}
	}
}
