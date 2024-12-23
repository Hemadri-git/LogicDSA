package com.array;

public class CountEleApperingKTimes
{
    public static void countELe(int[] arr, int k){
        boolean found = false;

        for (int i = 0; i<arr.length; i++){
            if(isAvailable(arr, arr[i], i)){
                continue;
            }
            int count = 0;
            for (int j = 0; j<arr.length; j++){
                if (arr[i] == arr[j]){
                    count++;
                }
            }
            if (count == k){
                found = true;
                System.out.print(arr[i] + " ");
            }
        }

        if (!found){
            System.out.println("No element Found");
        }
    }

    private static boolean isAvailable(int[] arr, int ele, int index) {

        for (int i = 0; i<index; i++){
            if (arr[i] == ele){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5, 5};
        System.out.print("Elements found K times : ");
        countELe(arr, 2);

    }
}
