package com.core.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrefixWithNumber {
    public static void main(String[] args) {
        Integer arr[]= {12,34,567,7890,43,32,51,-89};
       List<Integer> list=Arrays.asList(arr);
        List<Integer> num2 = list.stream().map(e -> String.valueOf(e)).
                filter(e -> e.startsWith("5") || e.startsWith("-")).
                map(Integer::valueOf).collect(Collectors.toList());

        List<Integer> num = list.stream().
                filter(e -> e.toString().startsWith("5")).collect(Collectors.toList());



        System.out.println(num);
    }
}
