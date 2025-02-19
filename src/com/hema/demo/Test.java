package com.hema.demo;

import java.util.Scanner;

public class Test
{

    static int[] insertArr(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("insert elements: ");
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    static void printArr(int arr[]){
        System.out.println("Displaying: ");
        for(int i : arr){
            System.out.print(i+ " ");
        }
    }

    public static void main(String[] args) {

       int[] arr = insertArr();
       int n = arr.length;

       int min = Integer.MAX_VALUE;

       for (int i = 0; i<n; i++){
           if (arr[i] < min){
               min = arr[i];
           }
       }
        System.out.println(min);

    }
}
