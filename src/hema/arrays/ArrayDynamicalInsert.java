package hema.arrays;

import java.util.Scanner;

public class ArrayDynamicalInsert
{
    public static int[] ArrayInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Insert "+ n + " elements to array: ");
        for (int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void ArrayOutput(int arr[]){
        System.out.println("Elements you had entered: ");
        for (int i = 0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

    int arr[] = ArrayInput();
    ArrayOutput(arr);

    }
}
