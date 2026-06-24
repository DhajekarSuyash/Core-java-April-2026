package com.java.core.maps;

import java.util.HashMap;
import java.util.Map;

public class MapIterationStrem {
	
	public static void main(String[] args) {
		
		Map<Integer, String> studentMap = new HashMap<Integer, String>();
		studentMap.put(101, "Ram");
		studentMap.put(102, "Akshay");
		studentMap.put(103, "Gopal");
		studentMap.put(104, "Neha");
		studentMap.put(105, "Raghav");
		studentMap.put(106, "Abhijeet");
		studentMap.put(107, "Akash");
		studentMap.put(108, "Manasi");
		studentMap.put(109, "Renuka");
		
		
		//entrySet() with stream()
		
		studentMap.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() +
															" : " + entry.getValue()));
		
		System.out.println("******************************************");
		System.out.println("Studdent with odd roll number");
		//filter operation on keys
		
		studentMap.entrySet().stream()
		.filter(x -> x.getKey() %2 != 0)
		.forEach(entry -> System.out.println(entry.getKey() +
										" : " + entry.getValue()));
		
		System.out.println("******************************************");
		System.out.println("Studdent name starting with 'A' ");
		//filter operation on value
		
		studentMap.entrySet().stream()
		.filter(x -> x.getValue().startsWith("A"))
		.forEach(entry -> System.out.println(entry.getKey() +
				" : " + entry.getValue()));
		
		System.out.println("********************************************");
		
		studentMap.keySet().stream()
		.forEach(key -> System.out.println(studentMap.get(key)));
		
	}

}
