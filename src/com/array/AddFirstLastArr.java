package com.array;

public class AddFirstLastArr
{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int length = arr.length;
        int first = arr[0];
        int last = arr[length-1];
        int add = first+last;
        System.out.println(add);
    }
}
