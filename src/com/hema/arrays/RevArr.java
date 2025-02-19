package com.hema.arrays;

public class RevArr
{
    public static void main(String[] args) {

        int arr[] = { 1313, 253, 234, 335, 435};
        int n = arr.length;

        System.out.println("Normal Array: ");
        for (int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nReversed Array: ");
        for (int j = n - 1; j>=0; j--){
            System.out.print(arr[j] + " ");
        }
    }
}
