package com.core.recursion;

public class BinarySearchSorted {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 7, 7, 34};
        boolean bool = isSoretd(arr, arr.length-1);
        System.out.println(bool);
    }

    static boolean isSoretd(int arr[], int size) {
        if (size == 0 || size == 1)
            return true;

        if (arr[size] < arr[size - 1]) {
            return false;
        } else {

            return isSoretd(arr, size-1);


        }

    }
}