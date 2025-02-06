package com.wipro.java.collection;

import java.util.Comparator;

public class AgeComparator implements Comparator<Animal> {
    
	@Override
    public int compare(Animal a1, Animal a2) {
        return Integer.compare(a1.getAge(), a2.getAge()); // Sort by age
    }

}
