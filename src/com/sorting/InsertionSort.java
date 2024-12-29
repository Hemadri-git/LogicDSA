package com.sorting;

public class InsertionSort
{
    public static void insertion(int[] arr){
        int n = arr.length;

        for (int i = 1; i<n; i++){
            int key = arr[i];
            int j = i-1;

            while (j>=0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    public static void main(String[] args) {
        int[] arr = {22, 1, 3, 5, 2, 4};
        System.out.println("Before sort: ");
        for (int i : arr){
            System.out.print(i + " ");
        }

        System.out.println("\nAfter sort: ");
        insertion(arr);
        for (int i : arr){
            System.out.print(i+ " ");
        }
    }
}
