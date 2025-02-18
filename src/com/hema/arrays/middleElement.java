package com.hema.arrays;

public class middleElement
{
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;


            if (n%2 == 1){
                System.out.println(arr[n/2]);
            }
            else {
                System.out.println(arr[n/2] + " " + arr[n/2 -1 ]);
            }


    }



}
