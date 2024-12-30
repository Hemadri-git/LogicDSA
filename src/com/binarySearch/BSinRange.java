package com.binarySearch;

public class BSinRange
{
    public static int bsrange(int[] arr, int key){
        int start = 3;
        int end = 6;
        while (start<=end){
            int mid = start + (end - start) / 2;
            if (key == arr[mid]){
                return mid;
            }
            else if (key > arr[mid]){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }
    private static void sort(int[] arr){
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
    public static void main(String[] args) {
        int[] nums = {3,4,5,6,7,8,12,13};
        sort(nums);
        int ele = 7;

        int index = bsrange(nums, ele);
        if (index != -1){
            System.out.println(ele+ " found at index "+ index);
        }
        else {
            System.out.println("ele not found");
        }
    }
}
