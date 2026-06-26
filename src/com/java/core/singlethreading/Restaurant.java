package com.java.core.singlethreading;

public class Restaurant {
	
	public static void main(String[] args) {
		
		//cooking
		// serving
		System.out.println(Thread.currentThread());
		
		for (int i = 0 ;  i <= 20 ; i++) {
			System.out.println("Abhishek is cooking" +i);
		}
		
		
		for (int i = 0 ;  i <= 20 ; i++) {
			System.out.println("Abhishek is serving" +i);
		}
		
		System.out.println(Thread.currentThread());
		
		
		
		
		
	}

}
