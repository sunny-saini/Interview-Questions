package com.core.roughWork;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayArrangement {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -4, -1, 4};

        arrangeArray(arr);

        System.out.println(Arrays.toString(arr));
    }

    private static void arrangeArray(int[] arr) {
        int[] arrangedArray = Arrays.stream(arr)
                .boxed()  // Convert to Integer stream
                .sorted((a, b) -> Integer.compare(Math.abs(a), Math.abs(b)))
                .mapToInt(Integer::intValue)  // Convert back to int stream
                .toArray();

        System.arraycopy(arrangedArray, 0, arr, 0, arrangedArray.length);
    }
}
