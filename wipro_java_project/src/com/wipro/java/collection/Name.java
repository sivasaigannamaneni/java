package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Name implements Comparator<Movie1>{ 
	public int compare(Movie1 m1,Movie1 m2) {
		return m1.getN().compareTo(m2.getN());
	}
	public static void main(String a[]) {
		ArrayList<Movie1> m1=new ArrayList<>();
		m1.add(new Movie1("Baahuballi",8.3,2015));
		m1.add(new Movie1("RRR",8.8,2012));
		m1.add(new Movie1("Baahuballi2",8.5,2017));
		
		Collections.sort(m1,new Name());
		System.out.println("Movies sortedby name");
		for(Movie1 m : m1) {
			System.out.println(m.getN() +" " + m.getR() + " " + m.getY());
		}
	}
}
