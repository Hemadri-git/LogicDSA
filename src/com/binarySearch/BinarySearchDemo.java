package com.binarySearch;

public class BinarySearchDemo
{
    public static int search(int[] arr, int k){
        int start = 0;
        int end = arr.length -1;

        while(start<=end){
            int mid = start + (end - start) / 2;

            if(arr[mid] == k){
                return mid;
            }
            else if(k > arr[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }

        return -1;
    }
    public static void sort(int arr[]){
        int n = arr.length;

        for(int i = 0; i<n-1; i++){
            for(int j = 0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {6,4,3,1,5,2};
        int ele = 4;
        
        sort(arr);

        int index = search(arr, ele);
        if(index == -1){
            System.out.println("Element Not Found");
        }
        else{
            System.out.println(ele + " Found at index : " + index);
        }
    }
}