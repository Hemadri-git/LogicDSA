package com.array;

import java.util.Scanner;

public class DynamicArray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Insert " + size+ " elements: ");
        for (int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements are: ");
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }


    }
}