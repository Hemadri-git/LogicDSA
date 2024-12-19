package com.array;

import java.util.Scanner;

public class SpecficIndexArr
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr= {100, 200, 300, 400, 500};
//        System.out.println(arr[3]);

        System.out.println("Enter index to retrieve value: ");
        int index = sc.nextInt();

        if (index >= 0 && index < arr.length){
            int value = arr[index];
            System.out.println("The Value at index " + index + " is " + value);
        }
        else {
            System.out.println("Index out of bound");
        }
    }
}
