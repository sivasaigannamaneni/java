package com.wipro.java.oops;

/**NO constructor
* Getters have return value
* setters have no return value
* properties are determined using private fileds
* values are behaviors are determined through setters
* toString will convert the entire animal class with properties and behaviors
*/

public class Animal {
	//private properties
	private String animalName;
	private int age;
	private String location;
	
	//Default constructor
		public Animal() {
			// TODO Auto-generated constructor stub
		}

	//Getter for name
	public String getAnimalName() {
		return animalName;
	}
	//Setter for name
	public void setAnimalName(String animalName) {
		this.animalName = "Lion";
	}
	
	//Getter for age
	public int getAge() {
		return age;
	}
	//Setter for age
	public void setAge(int age) {
		this.age = 5;
	}

	//Getter for location
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = "forest";
	}

	@Override
	public String toString() {
		return "Animal [animalName=" + animalName + ", age=" + age + ", location=" + location + "]";
	}

	

}

