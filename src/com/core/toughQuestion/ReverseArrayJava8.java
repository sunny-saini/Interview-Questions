package com.core.toughQuestion;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class ReverseArrayJava8 {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>(Arrays.asList(1,3,5,9,8,6,8));

      // List<Integer> output=list.stream().comprator(Collectors.reverse()).collect(Collectors.toList());
       List<Integer> ans = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
       // System.out.println(ans);

        List<Integer> str = list.stream().filter(al -> String.valueOf(al).startsWith("1")).collect(Collectors.toList());
     //   System.out.println(str);

        Map<Integer, Long> result = list.stream().collect(Collectors.groupingBy(i -> i, LinkedHashMap::new,Collectors.counting()));

       // System.out.println(result);

        Map<String, List<Integer>> ans2 = list.stream().collect(Collectors.groupingBy(i -> i % 2 == 0 ? "Even" : "odd"));
    System.out.println(ans2);

       int sum= list.stream().filter(i-> i%2==0).mapToInt(Integer::intValue).sum();
       System.out.println(sum);
    }
}
