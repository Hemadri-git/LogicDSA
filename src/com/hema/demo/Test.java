package com.hema.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Test {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5, 23, 1, 43, 55);

        Consumer<List<Integer>> printEle = list -> list.forEach(System.out::println);

        System.out.println("before sort: ");
        printEle.accept(numbers);

        numbers.sort((a, b) -> b -  a);

        System.out.println("After sort: ");
        printEle.accept(numbers);

    }


}
