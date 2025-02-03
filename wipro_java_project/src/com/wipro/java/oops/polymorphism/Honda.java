package com.wipro.java.oops.polymorphism;

public class Honda extends Car{

	public Honda() {
		// TODO Auto-generated constructor stub
	}
	public void details() {
		System.out.println("Company: "+getCompany()+" Brand: "+getBrand()+" Model: "+getModel());
	}
	public static void main(String a[]) {
		Car honda=new Honda();
		honda.setCompany("Honda");
		honda.setBrand("City");
		honda.setModel(2021);
		honda.details();
	}
}
