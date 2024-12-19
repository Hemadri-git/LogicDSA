package com.array;

public class MiddleEleArr
{
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};
        int length = arr.length;

        if (length%2 == 1){
            System.out.println("Middle Element: " + arr[length/2]);
        }
        else {
            System.out.println("Middle Elements: " + arr[length/2 - 1] +" "+ arr[length/2]);
        }
    }
}
