package com.array;

import java.util.Scanner;

public class Array {

    //to print array elements
    public static void printArr(int[] arr){
        System.out.print("Elements in array are: " );
        for (int i = 0; i< arr.length; i++){
            System.out.print( arr[i] + " ");
        }
        System.out.println();
    }

    //to insert array elements
    public static int[] createArr(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int size = sc.nextInt();
        int[] array = new int[size];

        System.out.println("Insert "+size+ " elements: ");

        for (int i = 0; i<array.length; i++){
            array[i] = sc.nextInt();
        }

        return array;
    }

    public static void OddEvenCountArr(int[] arr){

        int evenCount = 0, oddCount = 0;

        for (int num : arr){
            if (num%2 == 0){
                evenCount++;
            } else if (num%2 != 0) {
                oddCount++;
            }

        }
        System.out.println("Even: " + evenCount);
        System.out.println("Odd: "+ oddCount);
    }

    public static void main(String[] args) {

        int[] arr = createArr();
        OddEvenCountArr(arr);

    }
}
