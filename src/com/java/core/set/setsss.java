package com.java.core.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class setsss {
	
	public static void main(String[] args) {
		
		Set<Integer> s = new HashSet<Integer>();
		
		s.add(234);
		s.add(9000);
		s.add(76543);
		s.add(11);
		s.add(null);
		System.out.println(s);
		
		Set<Integer> sa = new LinkedHashSet<Integer>();
		sa.add(234);
		sa.add(9000);
		sa.add(76543);
		sa.add(11);
		sa.add(9000);
		sa.add(null);
		System.out.println(sa);
		
		Set<Integer> saa = new TreeSet<Integer>();
		saa.add(234);
		saa.add(9000);
		saa.add(76543);
		saa.add(11);
		saa.add(9000);
		//saa.add(null);
		System.out.println(saa);
	}

}
