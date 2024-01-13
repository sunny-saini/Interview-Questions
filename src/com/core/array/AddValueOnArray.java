package com.core.array;

import java.util.Arrays;

public class AddValueOnArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};

        for (int i=2;i<arr.length;i++){
            arr[i]+=3;
        }

        System.out.println(Arrays.toString(arr));
    }
}
