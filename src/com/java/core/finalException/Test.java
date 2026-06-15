package com.java.core.finalException;

import java.io.FileNotFoundException;

public class Test {
	
	public static void main(String[] args) {
		try {
			Zomato.orederFood("NOIDA");	
		}
		catch (InvalidCityException e) {
			System.out.println("Exception invalid city" +e);
		}
		
		
		System.out.println("IMP CODE");
		System.out.println("Exception Handled");
	}

}
