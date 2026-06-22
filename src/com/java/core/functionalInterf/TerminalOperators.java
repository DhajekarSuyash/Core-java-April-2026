package com.java.core.functionalInterf;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class TerminalOperators {

	public static void main(String[] args) {
		// Q. Filter even numbers from list using stream api
		List<Integer> l = Arrays.asList(1, 7, 4, 5, 12, 3, 5, 7, 98, 600, 564, 55, 75);

		// 1. print even numbers -> forEach()
		l.stream().filter(x -> x % 2 == 0).forEach(x -> System.out.println(x));

		// 2. store filtered even number in another list
		List<Integer> evenList = l.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		System.out.println("Even number list : " + evenList);

		// 3. Count even numbers from list
		long count = l.stream().filter(x -> x % 2 == 0).count();
		System.out.println("Even number count : " + count);

		// 4. Find first even number from list
		Optional<Integer> firstEven = l.stream().filter(x -> x % 2 == 0).findFirst();
		System.out.println("First even number : " + firstEven.get());

		// 5. find any even number from list
		//TODO - better example to get random 
		List<String> la = Arrays.asList( "Tuesday" ,"Monday", "Mango" , "Madrid", "Tuesday");
		Optional<String> anyEven = la.stream().filter(x -> x.startsWith("M")).findAny();
		System.out.println("Any word : " + anyEven.get());
		
		//================================================================================
		List<String> ls = Arrays.asList( "Marigold" ,"Monday", "Mango" , "Madrid", "Master","People");
		
		//6 are all elements starting from 'M'? -> boolean
		 Boolean flag = ls.stream().allMatch(x -> x.startsWith("M"));
		 System.out.println("Do all elements in ls starts with M : " + flag);
		 
		 //7 any of the word starts with 'P'? -> boolean -> false
		  Boolean flag2= ls.stream().anyMatch(x -> x.startsWith("P"));
		System.out.println("Starting with P : " + flag2);
		
		// 8
		 Boolean flag3 = ls.stream().noneMatch(x -> x.startsWith("Z"));
		System.out.println("nonmatch() : " +flag3);
		
		//=====================================================================================
		// 9. store filtered even number in Set
		 Set<Integer> evenSet = l.stream().filter(x -> x % 2 == 0).collect(Collectors.toSet());
		System.out.println("Even number Set : " + evenSet);
		
		//10. Store even number in Array
		Object[] evenArray= l.stream().filter(x -> x%2 ==0 ).toArray();
		System.out.println("Array of even number : "  +evenArray.toString());
	}

}
