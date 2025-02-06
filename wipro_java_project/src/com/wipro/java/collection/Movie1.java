package com.wipro.java.collection;

public class Movie1 {
	private String name;
	private double rating;
	private int year;
	
	public Movie1(String name,double rating,int year) {
		this.name=name;
		this.rating=rating;
		this.year=year;
	}
	public String getN() {
		return name;
	}
	public double getR() {
		return rating;
	}
	public int getY() {
		return year;
	}
}
