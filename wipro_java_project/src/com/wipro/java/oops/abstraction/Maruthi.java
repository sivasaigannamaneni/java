package com.wipro.java.oops.abstraction;

public class Maruthi extends Car1{

	public Maruthi() {
		// TODO Auto-generated constructor stub
	}
	@Override()
	void brand() {
		System.out.println("Brand : Maruthi");
	}
	@Override
	void mileage() {
		System.out.println("Mileage: 15");
	}
	public static void main(String a[]) {
		Car1 maruthi=new Maruthi();
		maruthi.brand();
		maruthi.mileage();
	}
}
