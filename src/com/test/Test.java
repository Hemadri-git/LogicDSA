package com.test;

import java.util.*;

class Test {
    public static int binary(int[] arr, int key){
        int start = 0;
        int end = arr.length-1;

        while (start<=end){
            int mid = start + (end - start) / 2;

            if (key == arr[mid]){
                return mid;
            } else if (key> arr[mid]) {
                start = mid + 1;

            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void sort(int arr[]) {

        int n = arr.length;

        for (int i = 1; i<n; i++){
            int current = arr[i];
            int j = i - 1;

            while (j>=0 && arr[j] > current){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
    }


    public static void main(String[] args)
    {
        int[] arr = {6,4,3,1,5,2};
        int ele = 5;

        sort(arr);

        int index = binary(arr, ele);
        if (index == -1){
            System.out.println("ele not found");
        }
        else {
            System.out.println(ele + " found in "+ index);
        }
    }
}
