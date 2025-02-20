package com.hema.arrays;

public class SortedCheck
{
    public static void main(String[] args) {

        int arr[] = {1, 5, 7, 9,78};
        int n = arr.length;
        boolean isAscSorted = true;
        boolean isDescSorted = true;

        for (int i = 1; i<n; i++){
            if (arr[i] < arr[i-1]){
                isAscSorted = false;
            }
            if (arr[i]>arr[i-1]){
                isDescSorted = false;
            }
        }
        System.out.println(isAscSorted || isDescSorted);


    }
}
