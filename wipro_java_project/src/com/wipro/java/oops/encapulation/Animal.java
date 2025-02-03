package com.wipro.java.oops.encapulation;

public class Animal {
	
	public Animal(String name, String colour, int age) {
		super();
		this.name = name;
		this.colour = colour;
		this.age = age;
	}
	private String name;
	private String colour;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColour() {
		return colour;
	}
	public void setSound(String sound) {
		this.colour = colour;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>0) {
			this.age=age;
		}
		else
		System.out.println("Age must be positive");
	}
	
public static void main(String a[]) {
		
		Animal animal=new Animal("Lion","Brown",5);
		System.out.println(animal.getAge());
		System.out.println(animal.getName());
		System.out.println(animal.getColour());
		
		animal.setAge(7);
		System.out.println(animal.getAge());
		System.out.println(animal.getName());
		System.out.println(animal.getColour());
		
		animal.setAge(-9);
		
		
	}
}
