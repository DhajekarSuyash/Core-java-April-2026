package com.java.core.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListss {
	
	public static void main(String[] args) {
	
		List<String> l = new ArrayList<String>();
		l.add("Monday");
		l.add("Tuesday");
		
		
		
		for( String a : l) {
			
			System.out.println(a);
		}
		
		
		
		
		//size()
		
		String s = l.get(1);
		System.out.println(s);
		
	}

}
