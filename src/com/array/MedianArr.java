package com.array;

public class MedianArr
{
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5,6};
        int n = arr.length;
        double median = 0.0;

        if (n%2 != 0){
            int mid = n/2;
            median = arr[mid];
        }
        else {
            int mid1 = n/2 - 1;
            int mid2 = n/2;
            median = (arr[mid1] + arr[mid2])/ 2.0;
        }
        System.out.println("median is :" + median);
    }

}
