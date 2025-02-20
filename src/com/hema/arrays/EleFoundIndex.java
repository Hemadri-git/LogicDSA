package com.hema.arrays;

public class EleFoundIndex
{
    public static void main(String[] args) {
        int[] arr = {32, 1, 332, 53, 23, 54};
        int search = 23;
        boolean found = false;

        for (int i = 0; i<arr.length; i++){
            if (search == arr[i]){
                System.out.println("Element found at "+i+" index");
                found = true;
                break;
            }
        }

        if (!found){
            System.out.println("ELement not found...");
        }


    }
}
