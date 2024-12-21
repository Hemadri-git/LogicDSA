package com.array;

public class OddEvenCountArr
{

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
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
}
