package com.array;

public class PrintDuplicateValuesArr
{
    public static boolean isProcessed(int[] arr, int ele, int index){
        for (int i = 0; i<index; i++){
            if (arr[i] == ele){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args)
    {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        int n = arr.length;
        boolean foundDuplicate = false;
        int totDup = 0;

        System.out.print("Duplicate elements : ");
        for (int i = 0; i<n; i++){
            if (isProcessed(arr, arr[i], i)){
                continue;
            }
            int count = 0;
            for (int j = 0; j<n; j++){
                if (arr[i] == arr[j]){
                    count++;

                }
            }
            if (count>1){
                System.out.print(arr[i] + " ");
                foundDuplicate = true;
                totDup++;
            }
        }
        if (!foundDuplicate){
            System.out.println("Not found");
        }
        System.out.println("\nNo of Duplicates: "+ totDup);
    }
}