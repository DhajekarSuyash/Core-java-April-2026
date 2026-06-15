package com.java.core.functionalInterf;

import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Testss {
	public static void main(String[] args) {
		
		Predicate<Integer> p =  t ->  t%2==0;
		System.out.println(p.test(9));
		
		Predicate<String> s = (String z) ->  z.startsWith("A");
		System.out.println(s.test("MONDAY"));
		
		//==================================================================

		Function<Integer, Integer> square = i -> (i*i);
		System.out.println(square.apply(10));
		
		//====================================================
		
		Consumer<String> c = ss -> System.out.println(ss.toLowerCase());
		c.accept("APPLE");
		
		//=================================================
		Supplier<String> sup = () -> "www.myntra.com";
		System.out.println("Myntra URL : " +sup.get());
		
		
	}

}
