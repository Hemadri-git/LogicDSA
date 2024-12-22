package com.array;

public class EvenOddIndexArr
{
    public static void findEvenandOddPositionElement(int[] arr){
        System.out.println("even index elements: ");
        for (int i = 0; i<arr.length; i++){
            if (i%2 == 0){
                System.out.print(arr[i]+ " ");
            }

        }
        System.out.println("\nodd index elements: ");
        for (int i = 0; i<arr.length; i++){
            if (i%2 != 0){
                System.out.print(arr[i]+ " ");
            }

        }


    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        findEvenandOddPositionElement(arr);

    }
}
