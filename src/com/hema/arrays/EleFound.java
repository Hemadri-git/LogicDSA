package com.hema.arrays;

public class EleFound
{
    public static void main(String[] args) {
        int arr[] = {1 ,4 ,3 ,5 ,2 ,6 ,5};
        int search = 1;
        boolean notfound = false;

        for (int i : arr){
            if (arr[i] == search){
                System.out.println("Element found");
                notfound = true;
                break;
            }

        }

        if (!notfound){
            System.out.println("Element not found..");
        }
    }
}
