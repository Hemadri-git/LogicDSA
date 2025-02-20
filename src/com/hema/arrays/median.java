package com.hema.arrays;

public class median
{
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int n = arr.length;
        double median;

        if (n%2==0){
            median = (arr[n/2 - 1] + arr[n/2]) / 2.0;
            System.out.println(median);
        }
        else {
            System.out.println(arr[n/2]);
        }

    }
}
