package com.array;

public class Test
{
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};
        int n = arr.length;
        System.out.println("even: ");
        for (int i = 0; i<n; i++){
            if (arr[i] % 2 == 0){
                System.out.println(arr[i]+ " ");
            }
        }
        System.out.println("Odd : ");
        for (int i = 0; i<n; i++){
            if (arr[i] % 2 == 1 ){
                System.out.println(arr[i] + " ");
            }
        }

    }
}
