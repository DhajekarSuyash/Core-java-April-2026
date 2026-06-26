package com.java.core.multithreading;

public class Cook extends Thread
{

	@Override
	public void run() {
		
		for (int i = 0; i <= 20; i++) {
			System.out.println("DAVID is cooking" 
		+ i + " : " + Thread.currentThread());
		}
	}
	
	

}
