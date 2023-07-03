package com.core.java8;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AverageNum {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,4,5,6,7,8,9,3,1,4);

        double ans = list.stream().mapToInt(e -> e).average().getAsDouble();
        System.out.println(ans);
    }
}
