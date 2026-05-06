package com.java.core.String;

public class StringTest {

	public static void main(String[] args) {

		String day = "TUESDAY";
		// gives length of string
		int length = day.length();
		System.out.println(length);

		char c = day.charAt(2);
		System.out.println(c);
		
		String dayLower = day.toLowerCase();
		System.out.println(dayLower);

		String abc = dayLower.toUpperCase();
		System.out.println(abc);

		boolean flag = day.contains("E");
		System.out.println(flag);

		String xyz = day.concat("ABCD");
		System.out.println(xyz);

	}

}
