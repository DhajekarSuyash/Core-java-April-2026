package com.java.core.practice;

public class Test {

	public static void main(String[] args) {
		//Parent 
		A a = new A();
		a.m1(); //m1 -- B
		a.m1(12); // M1 12
		
		B b = new B();
		b.m1(); //ma -- A
		b.m1(34); // m1 34
		
		A aa = new B();
		aa.m1(); // ma--A
		aa.m1(500); // m1 500 
		
		
	}

}
