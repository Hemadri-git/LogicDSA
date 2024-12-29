package com.test;

class Test{

    public static void insertion(int[] arr){
        int n = arr.length;

        for (int i = 1; i<n; i++){
            int key = arr[i];
            int j = i - 1;

            while (j>=0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }

    }

    public static void main(String[] args) {
        int arr[] = {12, 33, 6, 3,4,5};
        System.out.println("Before Sort: ");
        for (int x : arr){
            System.out.print(x + " ");
        }

        System.out.println("\nAfter sort: ");
        insertion(arr);
        for (int x: arr){
            System.out.print(x+ " ");
        }



    }
}
