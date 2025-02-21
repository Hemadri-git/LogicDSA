package com.hema.demo;

import java.util.Scanner;

public class Test
{

    public static void main(String[] args) {

        int[] arr = {1, 2, 1, 3, 4, 6, 2, 5, 4, 5, 5};
        int n = arr.length;
        int count = 0;
        boolean[] visited = new boolean[n]; // Track visited elements

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                int a = i;
                boolean isDuplicate = false;

                for (int j = i + 1; j < n; j++) {
                    if (arr[a] == arr[j]) {
                        visited[j] = true; // Mark duplicate as visited
                        isDuplicate = true;
                    }
                }

                if (isDuplicate) {
                    count++;
                }
            }
        }
        System.out.println(count + " elements are present more than one time");

    }
}
