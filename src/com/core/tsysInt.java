package com.core;

import java.util.Arrays;

public class tsysInt {
    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 0, 1, 1, 0, 0}; //(n)
        int j = -1;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < 1) {
                j++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        }

System.out.println(Arrays.toString(arr));
    }

}
