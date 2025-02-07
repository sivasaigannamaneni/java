package com.wipro.java.java8;

interface Square
{
	default void show() {
		System.out.println("polygon is Square");
	}
}
interface Rectangle
{
	default void show() {
		System.out.println("polygon is Rectangle");
	}
}
public class SuperDefault implements Square,Rectangle {

	public void show() {
		
		Square.super.show();
		Rectangle.super.show();
		
	}
	public static void main(String[] args) {
		
		SuperDefault si=new SuperDefault();
		si.show();
		
	}
}
