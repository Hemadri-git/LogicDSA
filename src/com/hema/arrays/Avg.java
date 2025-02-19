package com.hema.arrays;

public class Avg
{
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;
        int avg = 0;

        for (int i = 0; i<n; i++){
            avg = avg + (arr[i] );
        }
        avg = avg/n;
        System.out.println(avg);
    }
}
