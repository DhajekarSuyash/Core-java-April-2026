package com.java.core.Array;

public class TestArray {
	
	public static void main(String[] args) {

		int[] heights = {10,20,30,40,50};
		
		//System.out.println(heights.toString());
		
	//	System.out.println(heights.length);
		
		System.out.println(heights[0]);
		System.out.println(heights[1]);
		System.out.println(heights[2]);
		System.out.println(heights[3]);
		System.out.println(heights[4]);
		
		System.out.println("=================");
		for(int i = 0 ; i < heights.length ; i++) {
			System.out.println(heights[i]);
		}
	}

}
