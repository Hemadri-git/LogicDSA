package com.array;

public class PrintDuplicateValuesArr
{
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        int n = arr.length;
        int duplicateCount = 0;

        System.out.print("Duplicate Values: ");
        for (int i = 0; i<n; i++){
            int count = 1;
            for (int j = i+1; j<n; j++){
                if (arr[i] == arr[j]){
                    count++;
                }
            }
            if (count>1){
                System.out.print(arr[i] + " ");
                duplicateCount++;
            }
        }

        System.out.println("\nDuplicate count: " + duplicateCount);
    }
}