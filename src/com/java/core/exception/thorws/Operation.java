package com.java.core.exception.thorws;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Operation {
	//Runtime
	public void divison(int a , int b) throws FileNotFoundException
	{
		System.out.println("Important code - 1");
		int div = a/b;
		FileReader f = new FileReader("abc.txt");
		System.out.println(div);
		System.out.println("Important code -2");
	}
	
	//compileTime
	public void readFile() throws FileNotFoundException {
		FileReader f = new FileReader("abc.txt");
	}
	
	
}
