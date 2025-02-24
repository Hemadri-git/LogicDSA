package com.hema.arrays;

public class DuplicateElePrint {
    public static void main(String[] args) {
        int arr[] = {1, 2, 1, 3, 4, 6, 2, 5, 4, 3, 87};
        int n = arr.length;
        boolean[] printed = new boolean[n]; // Track printed duplicates

        for (int i = 0; i < n; i++) {
            if (printed[i]) continue; // Skip if already printed
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    printed[i] = true; // Mark as printed
                    break; // Avoid multiple prints of the same element
                }
            }
        }
    }
}
