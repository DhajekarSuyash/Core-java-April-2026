package com.java.core.customException;

public class Test2 {

	public static void main(String[] args) {
	
		try {
			
			something();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		System.out.println("Imp Code");
	}
	
	public static void something() {
		String s = null;
		if(s.equals(null)) {
			throw new NullPointerException();
		}
	}
}
