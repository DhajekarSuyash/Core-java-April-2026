package com.java.core.maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
	
	public static void main(String[] args) {
		// key-value pair
		// rollnumber - student
		// product - cost
		//101 -  Shubham 
		//102 - Akshay
		
		Map<Integer, String> m = new HashMap<Integer, String>();
		m.put(13312, "Shubham");
		m.put(11, "Akshay");
		m.put(120, "Raghav");
		m.put(1100, "xyz");
		
		System.out.println("Hash Map : random order : " +m);
		
		
		Map<Integer, String> lm = new LinkedHashMap<Integer, String>();
		lm.put(13312, "Shubham");
		lm.put(11, "Akshay");
		lm.put(120, "Raghav");
		lm.put(1100, "xyz");
		
		System.out.println("Linked Hash Map : insertion order : " +lm);
		
		Map<Integer, String> tm = new TreeMap<Integer, String>();
		tm.put(13312, "Shubham");
		tm.put(11, "Akshay");
		tm.put(120, "Raghav");
		tm.put(1100, "xyz");
		
		System.out.println("Tree Map : sorted order : " +tm);
		
		
	}

}
