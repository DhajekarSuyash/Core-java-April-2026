package com.java.core.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Introduction {
	
	public static void main(String[] args) {
		
		//Apple a = new Watermelon();
		
		List l = new ArrayList<>();
		l.add(12);
		l.add("SUYASH");
		l.add(false);
		
		System.out.println(l);

		Set s = new HashSet();
		s.add("monday");
		s.add("Tuesday");
		s.add("wednesday");
		s.add("thursday");
		System.out.println(s);
		
		
		Map<String , Integer> m = new HashMap();
		m.put("Ram", 87);
		m.put("Shyam", 85);
		m.put("Shubham", 78);
		System.out.println(m);
		
		
		
	}

}
