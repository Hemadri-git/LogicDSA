package com.array;

public class MinEleArray
{
    public static void main(String[] args) {
        int[] arr = {6, 3, 2, 1, 5, 5, 4};
        int n = arr.length;
        int min = arr[0];

        for(int i = 0; i<n; i++){
           if (arr[i] < min){
              min = arr[i];
           }
        }
        System.out.println(min);

    }
}
