package com.array;

import java.util.Random;
import java.util.Scanner;

public class RandomArr
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        Random random = new Random();

        for (int i = 0; i< arr.length; i++){
            arr[i] = random.nextInt(100) + 1;
        }

        System.out.println("generated Array: ");
        for (int i =0; i< arr.length; i++){
            System.out.print(arr[i] + " " );
        }

    }
}
