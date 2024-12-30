package com.array;

import java.util.Arrays;

public class FrequencyInArray {

//    public static void findFrequency(int a[]){
//        int n = a.length;
//
//        for (int i = 0; i<n; i++){
//            int found = 0;
//            int count = 1;
//
//            for (int j = 0; j<n; j++){
//                if (a[i] == a[j] && i<j){
//                    count++;
//                }
//                if (a[i] == a[j] && i>j){
//                    found++;
//                }
//            }
//            if (found == 0){
//                System.out.println(a[i] + " present " + count+ " times");
//            }
//        }
//    }

  //  Using 1 loop
    public static void findFrequency(int[] a) {
        Arrays.sort(a); // Sort the array
        int c = 1;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == a[i + 1]) {
                c++; // Count the frequency of the current element
            } else {
                System.out.println(a[i] + " present "+ c + " times"); // Print the element and its frequency
                c = 1; // Reset the counter
            }
            if (i + 1 == a.length - 1) {
                System.out.println(a[i + 1] + " present " + c + " times"); // Print the last element and its frequency
            }
        }
    }

    public static void main(String[] args) {
        int arr[] =  {1,3,2,3,2,2,5,2,6,3};
        for (int n: arr){
            System.out.print(n + " ");
        }

        Arrays.sort(arr);
        System.out.println("\nfrequencies: ");
        findFrequency(arr);

    }
}
