package com.java.core.something;

import java.io.FileNotFoundException;

public class Test {
	
	public static void main(String[] args) {
		try {
			A.pqr();
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("MAIN stuff");
		}
		
		System.out.println("Exception handled");

	
	}

}
