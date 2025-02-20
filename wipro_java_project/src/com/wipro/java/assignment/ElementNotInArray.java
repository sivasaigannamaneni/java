package com.wipro.java.assignment;

import java.util.*;
import java.io.*;

public class ElementNotInArray {

    public static int notInArray(int N, int A[], int K) {
        // Convert array to HashSet for O(1) lookups
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            set.add(A[i]);
        }
        
        // Start checking from K+1 upwards
        int result = K + 1;
        while (set.contains(result)) {
            result++;
        }
        
        return result;
    }
    
    // Non-editable main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int A[] = new int[N];
        
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        
        int K = sc.nextInt();
        
        System.out.print(notInArray(N, A, K));
        
        sc.close();
    }
}

