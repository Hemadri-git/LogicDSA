package com.binarySearch;

import java.util.Arrays;

public class FrequencyUsingBinarySearch {

    // Binary search to find the first occurrence
    public static int findFirst(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                result = mid;
                right = mid - 1;  // Move to the left half
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    // Binary search to find the last occurrence
    public static int findLast(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                result = mid;
                left = mid + 1;  // Move to the right half
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    // Main function to find and print frequencies
    public static void countFrequency(int[] arr) {
        Arrays.sort(arr);  // Ensure array is sorted for binary search
        int n = arr.length;
        int i = 0;

        System.out.println("Element Frequencies:");

        while (i < n) {
            int first = findFirst(arr, arr[i]);
            int last = findLast(arr, arr[i]);
            int frequency = last - first + 1;
            System.out.println(arr[i] + " -> " + frequency);
            i = last + 1;  // Skip to the next new element
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 8, 4, 6, 4, 5, 8};
        countFrequency(arr);
    }
}
