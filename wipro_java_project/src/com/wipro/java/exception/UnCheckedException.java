package com.wipro.java.exception;

public class UnCheckedException {

	public UnCheckedException() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String a[]) {
		try {
		String str=null;
		System.out.println(str.length());
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
	}
}
