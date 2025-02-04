package com.wipro.java.exception;

public class DivideByZero {
	static int i=100;
	public DivideByZero() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String a[]) {
		int j=0;
		int ans;
		try {
			ans=i/j;
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
		finally {
			System.out.println("Executed");
		}
		System.out.println("Remaining Code");
	}

}
