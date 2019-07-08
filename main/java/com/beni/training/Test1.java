package com.beni.training;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<Object> calc = new Test1().calc();
        System.out.println(calc);
    }

    public List<Object> calc() {
        List<Object> list = new ArrayList<Object>();
        for (int i = 0; i <= 100; i++) {
            if (i % 35 == 0) {
                list.add("fizzbuzz");
            } else if (i % 7 == 0) {
               list.add("fizz");
            } else if (i % 5 == 0) {
                list.add("buzz");
            } else {
                list.add(i);
            }
        }
        return list;
    }
}
