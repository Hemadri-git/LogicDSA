package com.array;

public class MaxEleArray
{
    public static void main(String[] args) {
        int[] arr = {6, 3, 2, 1, 5, 5, 4};
        int n = arr.length;
        int max = arr[0];

        for (int i = 0; i<n; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);

    }
}
