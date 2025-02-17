package com.hema.arrays;

import java.util.Scanner;

public class Arrays
{

    public static void print(int arr[]){
        for (int num : arr){
            System.out.println(num);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Arrays: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Insert "+ size+ " elements: ");
        for (int i = 0; i<arr.length; i++){
             arr[i] = sc.nextInt();
        }

        System.out.println("Displaying: ");
        print(arr);

    }
}
