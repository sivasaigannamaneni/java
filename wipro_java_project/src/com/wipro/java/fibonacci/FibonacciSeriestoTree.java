package com.wipro.java.fibonacci;

import java.util.Map;
import java.util.TreeMap;

public class FibonacciSeriestoTree {
	// Function to generate Fibonacci series and store in TreeMap
    public static Map<Integer, Long> generateFibonacci(int n) {
        Map<Integer, Long> fibonacciMap = new TreeMap<>();
        
        long a = 0, b = 1;
        
        // Store the first Fibonacci number
        fibonacciMap.put(0, a);
        if (n > 1) {
            fibonacciMap.put(1, b);
        }
        
        // Generate the rest of the Fibonacci numbers
        for (int i = 2; i < n; i++) {
            long next = a + b;
            fibonacciMap.put(i, next);
            a = b;
            b = next;
        }
        
        return fibonacciMap;
    }
    
    public static void main(String[] args) {
        int n = 10; // You can change this to generate a different number of Fibonacci numbers
        
        // Generate Fibonacci series and store in TreeMap
        Map<Integer, Long> fibonacciMap = generateFibonacci(n);
        
        // Print the Fibonacci series stored in the TreeMap
        System.out.println("Fibonacci Series (Key: Index, Value: Fibonacci Number):");
        for (Map.Entry<Integer, Long> entry : fibonacciMap.entrySet()) {
            System.out.println("Index: " + entry.getKey() + " Value: " + entry.getValue());
        }
    }

}
