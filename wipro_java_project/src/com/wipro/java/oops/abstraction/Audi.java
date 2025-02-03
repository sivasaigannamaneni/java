package com.wipro.java.oops.abstraction;

public class Audi extends Car1{

	public Audi() {
		// TODO Auto-generated constructor stub
	}
	@Override()
	void brand() {
		System.out.println("Brand : Audi");
	}
	@Override
	void mileage() {
		System.out.println("Mileage: 7");
	}
	public static void main(String a[]) {
		Car1 audi=new Audi();
		audi.brand();
		audi.mileage();
	}

}
