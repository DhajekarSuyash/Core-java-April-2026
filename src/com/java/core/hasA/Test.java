package com.java.core.hasA;

public class Test {

	public static void main(String[] args) {
		Document d = new Document();
		d.setAdharNo("123234");
		d.setPanNo("jdfk2");
		d.setLicense("sdfghjk");

		Student s = new Student();
		s.setRollNo(101);
		s.setFirstName("Kumar");
		s.setLastName("Patel");
		s.setCity("NOIDA");
		s.setDoc(d);
		
		System.out.println(s.getRollNo());
		System.out.println(s.getFirstName());
		System.out.println(s.getLastName());
		System.out.println(s.getCity());
		System.out.println(s.getDoc().getAdharNo());
		System.out.println(s.getDoc().getLicense());
		System.out.println(s.getDoc().getPanNo());
		

	}

}
