package com.core.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlapMapVsMap {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList(Arrays.asList(1, 2, 3, 4));
        List<Integer> list2= new ArrayList(Arrays.asList(1, 5, 6, 7));
        List<Integer> list3= new ArrayList(Arrays.asList(1, 5, 8, 9));

        List<List<Integer>> list4= new ArrayList<>(Arrays.asList(list,list2,list3));


        List<Integer> ans = list4.stream().flatMap(fmp -> fmp.stream()).collect(Collectors.toList());
        System.out.println(ans);



    }
}
