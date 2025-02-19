package com.hema.arrays;

public class MinEle
{
    public static void main(String[] args) {

        int[] arr = {21, 312, 213, 4,432};
        int min = arr[0];

        for (int i = 0; i<arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Min ele : "+ min);
    }
}
