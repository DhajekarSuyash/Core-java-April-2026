package com.java.core.String;

public class Example2 {
	public static void main(String[] args) {
		String x = "Apple";
		
		
		
		//to get single element
		for(int i = 0 ; i < x.length(); i++) {
			int flag = 0;
			//System.out.println(x.charAt(i));
			//to compare
			for(int j = 0 ; j < x.length(); j++) {
				
				if(x.charAt(i)== x.charAt(j)) {
					flag++;
					
				}
				
			}
			System.out.println(x.charAt(i)+" : "+ flag);
		}
		
	}

}
