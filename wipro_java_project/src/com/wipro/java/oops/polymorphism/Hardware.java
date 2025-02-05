package com.wipro.java.oops.polymorphism;

public class Hardware extends Engineer{

	public Hardware() {
		// TODO Auto-generated constructor stub
	}
	public void details() {
		System.out.println("Name : "+getName()+" Working Domain : "+getWorkDomain()+" Experience : "+getExperience());
	}
	public static void main(String a[]) {
		Engineer hardware=new Hardware();
		hardware.setName("abc");
		hardware.setWorkDomain("HardWare");
		hardware.setExperience(5);
		hardware.details();
	}

}
