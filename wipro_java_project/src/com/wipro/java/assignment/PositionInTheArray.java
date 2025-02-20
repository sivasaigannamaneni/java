package com.wipro.java.assignment;

import java.util.*;

public class PositionInTheArray {
    static int[] positions(int N, int X, int[] A) {
        List<Integer> list = new ArrayList<>();
        
        // Construct the list based on given array A
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < A[i]; j++) {
                list.add(i + 1);
            }
        }
        
        // Find first and last positions of X
        int firstPos = -1, lastPos = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == X) {
                firstPos = i + 1;
                break;
            }
        }
        
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) == X) {
                lastPos = i + 1;
                break;
            }
        }
        
        return new int[]{firstPos, lastPos};
    }

    // Non-editable part starts here
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        int[] A = new int[N];
        
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        
        int[] result = positions(N, X, A);
        System.out.println(result[0] + " " + result[1]);
    }
}

