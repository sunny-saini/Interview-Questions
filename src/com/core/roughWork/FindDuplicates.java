package com.core.roughWork;

import java.util.HashSet;

public class FindDuplicates {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 2, 6, 7, 8, 9, 5};

        findDuplicates(arr);
    }

    private static void findDuplicates(int[] arr) {
        HashSet<Integer> seenSet = new HashSet<>();

        System.out.println("Duplicate elements in the array:");

        for (int value : arr) {
            if (!seenSet.add(value)) {
                // If the value is already in the set, it's a duplicate
                System.out.println(value);
            }
        }
    }
}
