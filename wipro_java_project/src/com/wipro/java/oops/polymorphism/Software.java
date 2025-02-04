package com.wipro.java.oops.polymorphism;

public class Software extends Engineer{

	public Software() {
		// TODO Auto-generated constructor stub
	}
	public void details() {
		System.out.println("Name : "+getName()+" Working Domain : "+getWorkDomain()+" Experience : "+getExperience());
	}
	public static void main(String a[]) {
		Engineer software=new Software();
		software.setName("XYZ");
		software.setWorkDomain("Software");
		software.setExperience(5);
		software.details();
	}

}
