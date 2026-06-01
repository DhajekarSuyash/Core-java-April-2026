package com.java.core.exception.day2;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CompileTime {

	public static void main(String[] args) {

		try {
			FileReader f = new FileReader("abc.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("imp code");
	}
}
