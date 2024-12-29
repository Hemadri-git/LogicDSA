package com.sorting;

public class BubbleSort
{
    public static void sort(int[] arr){
        int n = arr.length;

        for (int i = 0; i<n-1; i++){
            for (int j = 0; j<n-i-1; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void printArr(int[] arr){
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {6, 3, 1, 45, 54, 22};
        System.out.println("original Array");
        printArr(arr);

        System.out.println("sorted array");
        sort(arr);
        printArr(arr);

    }
}
