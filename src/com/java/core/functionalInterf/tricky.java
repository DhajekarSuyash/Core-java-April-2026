package com.java.core.functionalInterf;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class tricky {
	
	public static void main(String[] args) {
	//if number is even then square the number and print it
		
//		int a = 12;
//		
//		if(a%2 ==0 ) {
//			System.out.println(a*a);
//		}
		
		//predicate , function , consumer and supplier
		
		Supplier<Integer> supplier =() -> 34;
		
		Predicate<Integer> predicate = x -> x%2==0;
		
		Function<Integer, Integer> function = x -> x*x;
		
		Consumer<Integer> consumer = x -> System.out.println(x);
		
		if(predicate.test(supplier.get())) {
			consumer.accept(function.apply(supplier.get()));
		}
		
	}

}
