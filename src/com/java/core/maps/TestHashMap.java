package com.java.core.maps;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {
	
	public static void main(String[] args) {
		
		Map<Integer, String> m = new HashMap<Integer, String>();
		
		m.put(13312, "Shubham");
		m.put(11, "Akshay");
		m.put(null, "Ram");
		m.put(null, "Sham");
		
		System.out.println("Hash Map : random order : " +m);
	}

}
