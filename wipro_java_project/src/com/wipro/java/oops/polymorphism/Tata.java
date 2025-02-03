package com.wipro.java.oops.polymorphism;

public class Tata extends Car{

	public Tata() {
		// TODO Auto-generated constructor stub
	}
	public void details() {
		System.out.println("Company: "+getCompany()+" Brand: "+getBrand()+" Model: "+getModel());
	}
	public static void main(String a[]) {
		Car tata=new Tata();
		tata.setCompany("Tata");
		tata.setBrand("Cruvv");
		tata.setModel(2024);
		tata.details();
	}
}
