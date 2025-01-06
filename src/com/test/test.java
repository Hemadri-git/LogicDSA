package com.test;

//import com.array.Array;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class test
{

    public static void main(String[] args) {
        LinkedList<Integer> li = new LinkedList<>();
        li.add(12);
        li.add(32);
        li.add(45);
        li.add(34);
        li.add(234);
        li.add(1, 24);
        li.set(1, 11);

//        li.getLast();
//        li.addAll(1, Collections.singleton(33));
//        Collections.reverse(li);
//        System.out.println("removed" +li.remove(2));
//        li.clear();
        System.out.println(li.listIterator());

    }
}
