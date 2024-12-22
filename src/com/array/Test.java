package com.array;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 5, 4, 5, 5};
        int targetFrequency = 2; // Elements appearing exactly 2 times
        int n = arr.length;

        // Step 1: Sort the array
        Arrays.sort(arr);

        // Step 2: Count frequencies using a single loop
        int count = 0;
        int elementCount = 0;

        System.out.println("Elements appearing exactly " + targetFrequency + " times:");
        for (int i = 0; i < n; i++) {
            elementCount++;
            // Check if the current element is the last or a new element starts
            if (i == n - 1 || arr[i] != arr[i + 1]) {
                if (elementCount == targetFrequency) {
                    System.out.print(arr[i] + " ");
                    count++;
                }
                elementCount = 0; // Reset the count for the next element
            }
        }

        // Step 3: Handle the case where no elements are found
        if (count == 0) {
            System.out.println("No element found");
        }
    }
}
