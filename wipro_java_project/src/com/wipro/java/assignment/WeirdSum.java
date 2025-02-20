package com.wipro.java.assignment;

import java.util.*;
import java.io.*;

public class WeirdSum {
    public static int[] weirdSum(int N, int A[]) {
        int result[] = new int[N];
        int totalSum = 0;
        
        // Calculate total sum of all elements
        for (int num : A) {
            totalSum += num;
        }
        
        // Compute weird-sum for each element
        for (int i = 0; i < N; i++) {
            result[i] = totalSum - A[i];
        }
        
        return result;
    }

    // Non-editable starts here
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        
        int[] result = weirdSum(N, A);
        
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        
        sc.close();
    }
}

