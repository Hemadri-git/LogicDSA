package com.array;


public class MajorityEleArr
{
    public static void main(String[] args) {
        int[] arr =  {3, 3, 4, 2, 4, 4, 2, 4, 4};

        int n = arr.length;
        int limit = n/2;
        boolean fount = false;

        for (int i = 0; i<n; i++){
            int count = 0;
            for (int j = i; j<n; j++){
                if (arr[i] == arr[j]){
                    count++;
                }
            }
            if (count > limit){
                System.out.print(arr[i] + " ");
                fount = true;
            }
        }

        if(!fount){
            System.out.println("No majority found");
        }

    }
}
