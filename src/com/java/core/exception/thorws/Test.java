package com.java.core.exception.thorws;

import java.io.FileNotFoundException;

public class Test {

	public static void main(String[] args) {
		
		Operation o = new Operation();
		try {
			o.divison(12, 0);
		}
		catch (ArithmeticException e) {
			System.out.println("Exception happened");
		}catch (NullPointerException e) {
			System.out.println("Null pointer came");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("VVIMP code");
		
		
		

		
		
		
		
		
		
		
		
		
	}
}
