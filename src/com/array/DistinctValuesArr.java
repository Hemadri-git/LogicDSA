package com.array;

public class DistinctValuesArr
{
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        int n = arr.length;
        int distinctCount = 0;

        System.out.println("Distinct elements: ");
        for (int i = 0; i<n; i++){
            int count = 0;
            for (int j= 0; j<n; j++){
                if (arr[i] == arr[j]){
                    count++;
                }
            }
            if (count == 1){
                System.out.print(arr[i] + " ");
                distinctCount++;
            }
        }
        System.out.println("\ndistinct Count : "+ distinctCount);
    }
}
