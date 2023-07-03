package com.core.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MatchingArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int arr2[]={1,4,5};
        int arr3[]={8,4,3,2};

        List<Integer> ans = Stream.of(arr, arr2,arr3).flatMap(fp -> Arrays.stream(fp).boxed()).sorted().collect(Collectors.toList());
        System.out.println(ans);

    }
}
