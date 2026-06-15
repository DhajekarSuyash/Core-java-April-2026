package com.java.core.set;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Example {
	public static void main(String[] args) {
		
		List<Integer> l = Arrays.asList(12,32,4,122,1);
		
		Set<Integer> s = new TreeSet<Integer>();
		
		for(int a : l ) {
			s.add(a);
		}
		System.out.println(s);
	}

}
