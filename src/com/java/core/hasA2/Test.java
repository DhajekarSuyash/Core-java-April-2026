package com.java.core.hasA2;

public class Test {
	
	public static void main(String[] args) {
		
		AccountDetails a = new AccountDetails();
		a.setAccountNo(1234);
		a.setBankName("HDFC");
		
		Employee e = new Employee();
		e.setEmpId(101);
		e.setName("KIRAN");
		e.setCity("DELHI");
		e.setDetails(a);
		
		System.out.println(e.getEmpId());
		System.out.println(e.getName());
		System.out.println(e.getCity());
		System.out.println(e.getDetails().getAccountNo());
		System.out.println(e.getDetails().getBankName());
		
		
	}

}
