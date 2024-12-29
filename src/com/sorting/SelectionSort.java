package com.sorting;

public class SelectionSort
{
    public static void selectionSort(int[] arr){
        int n = arr.length;
        int minIndex = -1;

        for (int i = 0; i<n-1; i++){
            minIndex = i;

            for (int j = i+1; j<n; j++){
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = { 22, 1, 4,5 ,3, 11, 7};
        System.out.println("Before sort: ");
        for (int x : arr){
            System.out.print( x+ " ");
        }

        System.out.println("\nAfter sort: ");
        selectionSort(arr);
        for (int i : arr){
            System.out.print(i + " ");
        }

    }
}
