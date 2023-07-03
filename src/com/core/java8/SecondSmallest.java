package com.core.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class SecondSmallest {
    public static void main(String[] args) {
        int arr[]={34,12,56,78,53,88,90};
        findSmallest(arr);
    }

    private static void findSmallest(int[] arr) {

        int num = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();


        int secondLargestNumber = Arrays
                .stream(arr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();

        System.out.println("Second Smallest : "+num);
    }
}
