package com.wipro.java.assignment;

import java.util.Scanner;

public class CountThePairs {

    public static int countPairs(int N, int[] A) {
        int count = 0;
        
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                int minHeight = Math.min(A[i], A[j]);
                boolean valid = true;
                
                for (int k = i + 1; k < j; k++) {
                    if (A[k] >= minHeight) {
                        valid = false;
                        break;
                    }
                }
                
                if (valid) {
                    count++;
                }
            }
        }
        
        return count;
    }

    // non editable starts here
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        int[] A = new int[N];
        String[] temp = scanner.nextLine().split(" ");
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(temp[i]);
        }
        System.out.println(countPairs(N, A));
    }
}

