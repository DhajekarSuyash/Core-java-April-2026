package com.java.core.something;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class A {
	
	public static void abc() throws ArithmeticException
	{
		System.out.println(10/0);
	}
	
	public static void xyz() throws FileNotFoundException {
		FileReader f = new FileReader("");
	}
	
	public static void pqr() throws NullPointerException {
		int a = 10;
		try {
			if(a == 0) {
				throw new NullPointerException("Nullpointer");
			}
			else {
				System.out.println("asdsdgfds");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("NP");
		}
	
		System.out.println("Imp code");
	}

}
