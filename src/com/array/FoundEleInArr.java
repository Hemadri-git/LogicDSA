package com.array;

public class FoundEleInArr
{
    public static void main(String[] args) {
        int[] arr = {1 ,4 ,3 ,5 ,2 ,6 ,5};
        int n = arr.length;
        int target = 6;
        boolean found = false;

        for (int i = 0; i<n; i++){
            if (arr[i] == target){
                System.out.println("Element found at index: " + i);
                found = true;
                break;
            }
        }

        if (!found){
            System.out.println("Element Not found");
        }
    }
}
