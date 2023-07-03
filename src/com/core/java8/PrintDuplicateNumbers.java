package com.core.java8;

import java.util.*;
import java.util.stream.Collectors;

public class PrintDuplicateNumbers {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,4,5,6,7,8,9,3,1,4);
     Set<Integer> dup=  list.stream().filter(e-> Collections.frequency(list,e)>1).collect(Collectors.toSet());
        System.out.println(dup);
        HashSet<Integer> set = new HashSet<Integer>();
        Set<Integer> dup2 = list.stream().filter(e -> !set.add(e)).collect(Collectors.toSet());

        System.out.println(dup2);
    }
}
