package com.wipro.java.collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
	public static void main(String a[]) {
		int n=5;
		List<Integer> l1=new LinkedList<Integer>();
		for(int i=0;i<n;i++) {
			l1.add(i);
		}
		System.out.println(l1);
		l1.add(5,5);
		System.out.println(l1);
		l1.remove(0);
		System.out.println(l1);
		l1.set(1,99);
		System.out.println(l1);
	}
}
