package com.java.core.customException;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test {

	public static void main(String[] args) {

		try {
			something();
			
			
		} catch (ChappalNotFoundException e) {
			// TODO: handle exception
			System.out.println("not found");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("IMP code");
	}

	public static void something() throws FileNotFoundException  {
	FileReader f = new FileReader("aaaa");
	}

}
