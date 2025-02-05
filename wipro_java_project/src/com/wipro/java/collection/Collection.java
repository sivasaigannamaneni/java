package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Collection {

	public static void main(String[] args) {
		int[] arr=new int[5];
		arr[0]=0;
		arr[1]=1;
		arr[2]=2;
		arr[3]=3;
		for(int i=0;i<5;i++) {
			System.out.print("Array :"+arr[i]);
		}
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(0,0);
		l1.add(1,1);
		l1.add(2,2);
		l1.add(3,3);
		System.out.println("LIST : "+l1);
		List<Integer> l2=new ArrayList<Integer>();
		l2.add(11);
		l2.add(22);
		l2.add(33);
		System.out.println("LIST : "+l2);
		l1.addAll(1,l2);
		System.out.println(l1);
		
		l1.remove(1);
		System.out.println("List After remove Element :"+l1);
		
		l1.set(0, 99);
		System.out.println("List After Set Element :"+l1);
		
		int n=5;
		List<Integer> l3=new LinkedList<Integer>();
		for(int i=0;i<n;i++) {
			l3.add(i);
		}
		System.out.println("Linked List"+l3);
		l3.remove(0);
		System.out.println("List After Remove Element :"+l3);
		l3.set(1,99);
		System.out.println("List After Set Element :"+l3);
		
		Map<Integer,String> map=new HashMap<>();
		map.put(1, "Apple");
		map.put(2, "Mango");
		map.put(3, "Banana");
		
		System.out.println("Key 1: "+map.get(1));
		System.out.println("Key 1: "+map.get(2));
		System.out.println("Key 1: "+map.get(3));
		
		if(map.containsKey(3)) {
			System.out.println("Key 3b exists with value: "+map.get(3));
		}
		System.out.println("Iteration through map:");
		for(Map.Entry<Integer, String> entry: map.entrySet()) {
			System.out.println(entry.getKey() + ": "+entry.getValue());
		}
		map.remove(2);
		System.out.println("Map After Removal:");
		for(Map.Entry<Integer, String> entry: map.entrySet()) {
			System.out.println(entry.getKey() + ": "+entry.getValue());
		}
	}

}
