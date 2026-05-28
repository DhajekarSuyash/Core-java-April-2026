package com.java.core.abs.interfaces;

public interface College {
	
//no constructor
//static and non static variables allowed	
	
	
	
	public void getFees();
	
	public void m1();
	
	//java 8
	public static void getTeacherFeedback() {
		
	}
	
	default void m4() {
		m2();
	}
	
	//java 9
	private void m2() {
		
	}
	
	
}
