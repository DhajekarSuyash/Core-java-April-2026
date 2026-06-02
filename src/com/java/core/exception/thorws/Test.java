package com.java.core.exception.thorws;

import java.io.FileNotFoundException;

public class Test {

	public static void main(String[] args) {
		
		Operation o = new Operation();
		try {
			o.divison(12, 0);
		}
		catch (Exception e) {
			System.out.println("Exception happened");
		}
		
		System.out.println("VVIMP code");
		
		
		
		try {
			o.readFile();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
	}
}
