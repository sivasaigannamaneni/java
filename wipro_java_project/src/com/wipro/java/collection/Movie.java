package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;

public class Movie implements Comparable<Movie>{
	private String name;
	private double rating;
	private int year;
	
	public Movie(String name,double rating,int year){
	this.name=name;
	this.rating=rating;
	this.year=year;
	}
	public int compareTo(Movie m) {
		return this.year-m.year;
	}
	public String getName() {
		return name;
	}
	public double getRating() {
		return rating;
	}
	public double getYear() {
		return year;
	}
	public static void main(String a[]) {
		ArrayList<Movie> l=new ArrayList<>();
		l.add(new Movie("ABC",9.0,2000));
		l.add(new Movie("PQR",9.5,2009));
		l.add(new Movie("XYZ",9.7,2021));
		Collections.sort(l);
		System.out.println("Movies After Sorting: ");
		for(Movie m : l) {
			System.out.println(m.getName() +" " + m.getRating() + " " + m.getYear());
		}
	}
}
