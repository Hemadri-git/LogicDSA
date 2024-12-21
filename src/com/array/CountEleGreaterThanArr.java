package com.array;

public class CountEleGreaterThanArr
{
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0, avg = 0, count = 0;

        for (int num : arr){
            sum = sum + num;
        }

        avg = sum/arr.length;

        for (int num : arr){
            if (num > avg){
                count++;
            }
        }
        System.out.println(count);

    }
}
