package com.core.toughQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseArrayJava8 {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>(Arrays.asList(1,3,5,9,8,6));

       // List<Integer> output=stream().comprator(Collectors.reverse()).collect(Collectors.toList());
        List<Integer> ans = list.stream().sorted().collect(Collectors.toList());
        System.out.println(ans);

    }
}
