package com.java.core.exception.day2;

import java.io.FileReader;
import java.io.IOError;

//un-checked exception
public class Runtime {

	public static void main(String[] args) {

		int a = 10;
		int b = 0;
		
		String s = null;
		
		try {
			System.out.println(s.toLowerCase());
			System.out.println(a/b);
			FileReader f = new FileReader("abc.txt");
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
		}
		catch (NullPointerException e) {
			// TODO: handle exception
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
		
				

	}

}
