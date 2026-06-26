package com.java.core.multithreading;

public class Restaurant {

	public static void main(String[] args) {
		// cooking
		// serving
		
		Cook c = new Cook();
		c.start();
		
		
		for (int i = 0; i <= 20; i++) {
			System.out.println("Abhishek is serving" + i
					+ " : " + Thread.currentThread());
		
		}

	}

}
