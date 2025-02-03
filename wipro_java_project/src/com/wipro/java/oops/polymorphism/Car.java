package com.wipro.java.oops.polymorphism;

public class Car {
	private String company;
	private String brand;
	private int model;
	public Car() {
		// TODO Auto-generated constructor stub
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		this.model = model;
	}
	public void details() {
		System.out.println("Company: "+company+" Brand: "+brand+" Model: "+model);
	}
}
