package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Rate implements Comparator<Movie1>{
	
	public int compare(Movie1 m1,Movie1 m2) {
		return Double.compare(m2.getR(),m1.getR());
	}
	
	public static void main(String[] args) {
		ArrayList<Movie1> m1=new ArrayList<>();
		m1.add(new Movie1("Baahuballi",8.3,2015));
		m1.add(new Movie1("RRR",9.0,2012));
		m1.add(new Movie1("Baahuballi2",8.1,2017));
		
		Collections.sort(m1, new Rate());
    	System.out.println("Movies sorted by rating (Descending order):");
    	for (Movie1 m: m1) {
    		System.out.println(m.getR() + " " + m.getN() + " " + m.getY());
    	}

	}

}
