package com.core.sort;

/*
TC= O(n2)
SC=O(1)

Inplace Not Stable



Givin N array
elements Find the
kth smallest element
 */

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] result = sort(new int[]{6, 5, 4, 30, 2, 1});
        System.out.println(Arrays.toString(result));


    }

    static int[] sort(int[] arr) {
        int min;

        for (int i = 0; i < (arr.length - 1); i++) {
            int ind = i;
            min = arr[i];

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    ind = j;
                }
            }
            if (ind != i) {
                int temp = arr[i];
                arr[i] = arr[ind];
                arr[ind] = temp;

            }
        }


        return arr;
    }

}