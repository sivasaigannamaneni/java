/**
 * 
 */
package com.wipro.java;

/**
 * 
 */
public class Flower {

	String nameFlower;
	int priceFlower;
	public Flower(String name,int price) {
		this.nameFlower=name;
		this.priceFlower=price;
	}

	void sale() {
		System.out.println("Flower: "+nameFlower+" Price: "+priceFlower);
	}
	public static void main(String[] args) {
		Flower flower1=new Flower("Rose",10);
		Flower flower2=new Flower("SunFlower",5);
	}

}
