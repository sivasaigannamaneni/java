package com.wipro.java.oops.interface1;

public class Dog implements Animal,AnimalEat{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Pedigie");
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("Bark");
	}
	public static void main(String a[]) {
		Animal dog=new Dog();
		AnimalEat animaleat=new Dog();
		dog.sound();
		animaleat.eat();
	}
}
