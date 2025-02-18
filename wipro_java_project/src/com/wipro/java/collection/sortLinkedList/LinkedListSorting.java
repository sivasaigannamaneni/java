package com.wipro.java.collection.sortLinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListSorting {
    public static void main(String[] args) {
        // Create a LinkedList of Person objects
        LinkedList<Person> peopleList = new LinkedList<>();

        // Add Person objects to the list
        peopleList.add(new Person("Alice", 30));
        peopleList.add(new Person("Bob", 25));
        peopleList.add(new Person("Charlie", 35));
        peopleList.add(new Person("Diana", 28));

        // Print the list before sorting
        System.out.println("Before Sorting:");
        for (Person person : peopleList) {
            System.out.println(person);
        }

        // Sort the LinkedList using the AgeComparator
        Collections.sort(peopleList, new AgeComparator());

        // Print the list after sorting
        System.out.println("\nAfter Sorting by Age:");
        for (Person person : peopleList) {
            System.out.println(person);
        }
    }
}