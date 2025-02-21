package com.hema.arrays;

public class ElePresentMoreThanOneTime
{
    public static void main(String[] args) {

        int[] arr = {1,2,1,3,4,6,2,5,4,  5};
        int n = arr.length;
        int count=0;
        boolean[] visited = new boolean[n];

        for (int i = 0; i<n; i++) {
            if (!visited[i]) {
                int a = i;
                boolean isDuplicate = false;
                for (int j = i + 1; j < n; j++) {
                    if (arr[a] == arr[j]) {
                        visited[j] = true;
                        isDuplicate = true;
                    }
                }

                if (isDuplicate) {
                    count++;
                }
            }
        }
        System.out.println(count + " is appear more than one time");
    }
}
