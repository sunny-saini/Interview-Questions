package com.core.intervirew;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortingProgram {
    public static void main(String[] args) {
        int arr[] = {2,7, 4, 8, 5, 1, 2};

        String str = "I am java developer";

        Map<Character, Long> countOccernece = str.chars().mapToObj(num -> (char) num).collect(Collectors.groupingBy(i -> i, Collectors.counting()));


      //  System.out.println(countOccernece);

        List<String> strlst = Arrays.asList("Ravi", "Sumit", "Ankita", "Amit", "suresh", "Aki");

        List<String> ans = strlst.stream().sorted(Comparator.comparing(st -> st.length())).collect(Collectors.toList());
        System.out.println("ans "+ans);



    }
}
