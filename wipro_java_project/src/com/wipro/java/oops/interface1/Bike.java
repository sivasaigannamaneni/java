package com.wipro.java.oops.interface1;

public class Bike implements Vehicle{

	@Override
	public void wheeler() {
		// TODO Auto-generated method stub
		System.out.println("Two Wheeler");
	}


	public static void main(String a[]) {
		Vehicle one=new Bike();
		one.wheeler();
	}

	

}
