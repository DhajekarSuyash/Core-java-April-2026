package com.java.core.conditionalstatement;

public class nestedifcondition {
	
	public static void main(String[] args) {
		
		int a = 10;
		
		//condn -> if number is divisble by 2 and 3 then is it a good number
		
		
		if(a%2 == 0 ) {
			System.out.println("number is divisible by 2");
			
			if(a % 3 == 0) {
				System.out.println(" it is a good number");
			}
			else {
				System.out.println("it is a bad number");
			}
		}
		
		
		
	}

	

	
}
