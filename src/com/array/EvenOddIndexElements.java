package com.array;

public class EvenOddIndexElements {

    public static void findEvenandOddPositionElement(int[] arr) {
        System.out.print("Even index elements: ");
        for (int i = 0; i < arr.length; i += 2) {
            System.out.print(arr[i] + " ");
        }

        System.out.print("\nOdd index elements: ");
        for (int i = 1; i < arr.length; i += 2) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        findEvenandOddPositionElement(arr);
    }
}
