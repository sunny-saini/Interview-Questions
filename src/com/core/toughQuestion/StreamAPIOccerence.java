package com.core.toughQuestion;

import java.util.*;
import java.util.stream.Collectors;

public class StreamAPIOccerence {

    static String  str="aebboo";
    static List<Integer> nums= new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,6));

    public static void main(String[] args) {
        Character a = str.chars().mapToObj(i -> (char) i).
                collect(Collectors.groupingBy(i -> i, LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(val -> val.getValue() == 2).map(key -> key.getKey()).findFirst().get();
   System.out.println(a);

        Map<Integer, Long> valueResult = nums.stream().
                collect(Collectors.groupingBy(i -> i, Collectors.counting()));
   System.out.println(valueResult);
    }
}
