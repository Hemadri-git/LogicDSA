package com.hema.arrays;

public class MaxEle
{
    public static void main(String[] args) {

        int[] arr = {21, 1, 12, 34, 32};
        int max = arr[0];

        for (int i = 0; i<arr.length;  i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Max ele: "+ max);
    }
}
