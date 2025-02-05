package com.wipro.java.oops.interface1;

public class Car implements Vehicle{

	@Override
	public void wheeler() {
		// TODO Auto-generated method stub
		System.out.println("Four Wheeler");
	}
	public static void main(String a[]) {
		Vehicle two=new Car();
		two.wheeler();
	}
}
