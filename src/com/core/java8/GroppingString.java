package com.core.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroppingString {
    public static void main(String[] args) {
        List<String> l = Arrays.asList("Raashi","Martin","Rastogi","Sandra","Vicky","Mouse","Micky","Vihaan","Rahul","Rahul");

        Map<Character, List<String>> ans = l.stream().collect(Collectors.groupingBy(gp -> gp.charAt(0), Collectors.toList()));

        Map<String, Long> ans2 = l.stream().collect(Collectors.groupingBy(gp -> gp, Collectors.counting()));


        System.out.println(ans);

     
    }
}
