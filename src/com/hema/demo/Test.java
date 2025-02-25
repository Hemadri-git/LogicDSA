package com.hema.demo;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 4, 6, 2, 5,6,  4, 3, 6};
        int n = arr.length;
        boolean[] printed = new boolean[n];

        for (int i = 0; i<n; i++){
            if (printed[i])
                continue;

            for (int j = i+1; j<n; j++){
                if (arr[i] == arr[j]){
                    System.out.println(arr[i]);
                    printed[i] = true;
                    break;
                }
            }
        }

    }


}
