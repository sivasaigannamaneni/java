package com.wipro.java.collection.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class UseCaseHashmap {
public static void main(String[] args) {
        
        // Create and populate a TreeMap
        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("A", "Apple");
        treeMap.put("B", "Banana");
        treeMap.put("C", "Cherry");
        treeMap.put("D", "Date");

        // Print the TreeMap contents
        System.out.println("TreeMap: " + treeMap);

        // Fetch data from TreeMap and store it in a HashMap
        HashMap<String, String> hashMap = new HashMap<>();
        
        // Iterate through the TreeMap and copy its entries into the HashMap
        for (Map.Entry<String, String> entry : treeMap.entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue());
        }

        // Print the HashMap contents
        System.out.println("HashMap: " + hashMap);
    }
}
