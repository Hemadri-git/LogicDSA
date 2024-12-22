package com.array;

public class CountEleApperingKTimes
{
    public static void main(String[] args) {
        int[] arr =  {5, 5, 5, 1, 1, 2, 2, 3, 4, 4};
        int n = arr.length;

        for (int i = 0; i<n ; i++){
            int count = 0;
            for (int j = i; j<n; j++){
                if (arr[i] == arr[j]){
                    count++;
                }
            }
            if ( count == 2 && count < 3 ){
                System.out.println(arr[i]);
            }
        }
    }
}
