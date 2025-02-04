package com.wipro.java.exception;

public class DivideByZero {

	public DivideByZero() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String a[]) {
		int num1=10, num2=2,num3;
		
		try {
			num3=num1/num2;
			System.out.println(num3);
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
		finally {
			System.out.println("Execut if Exception is their or not");
		}
		System.out.println("Remaining Code");
	}

}
