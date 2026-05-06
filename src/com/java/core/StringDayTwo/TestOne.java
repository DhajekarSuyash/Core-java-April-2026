package com.java.core.StringDayTwo;

public class TestOne {
	
	public static void main(String[] args) {
		
		String s = "123@#$";
		//w
		//e
		//d
		//n
		//wdedy
	//	System.out.println(s.length());
		
		for(int i = 0; i <= s.length()-1 ; i++) {
				System.out.println(s.charAt(i));
		}
		System.out.println("==========================");
		
		for(int i = s.length() -1 ; i >= 0 ; i--) {
			System.out.println(s.charAt(i));
		}
		
		
		
		
	}

}
