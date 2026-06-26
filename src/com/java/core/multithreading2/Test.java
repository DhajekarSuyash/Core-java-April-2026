package com.java.core.multithreading2;

public class Test {
	
	public static void main(String[] args) {
		
	
		
		
		for(int i =0 ;  i <= 20; i++) {
			System.out.println(Thread.currentThread()
					+" : " +i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
//		Manager  m = new Manager();
//		
//		Thread t = new Thread(m);
//		
//		t.start();
		
	}

}
