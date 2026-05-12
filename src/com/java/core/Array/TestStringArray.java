package com.java.core.Array;

public class TestStringArray {

	public static void main(String[] args) {

		String[] days = { "Mon", "Wed", "Thurs", "Fri", "Sat", "Sun", "Tues" };

		// System.out.println(days[1]);
		// System.out.println(days[3]);

		for (int i = 0; i < days.length; i++) {

			//String singleDay = ;

			if (days[i].startsWith("T")) {
				System.out.println(days[i]);
			}
		}

	}

}
