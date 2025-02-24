package com.hema.demo;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 4, 6, 2, 5, 4};
        System.out.println(countDuplicateElements(arr) + " elements are present more than one time");
    }

    public static int countDuplicateElements(int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int count = 0;
        for (int value : frequencyMap.values()) {
            if (value > 1) {
                count++;
            }
        }

        return count;
    }
}
