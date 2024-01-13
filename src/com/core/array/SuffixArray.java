package com.core.array;

import java.util.Arrays;

public class SuffixArray {
    public static void main(String[] args) { 
        int []arr={10,4,5,6,9};
        int suffix[]=new int[arr.length];

        suffix[arr.length-1]=arr[arr.length-1];
        for(int i=arr.length-1;i>=1;i--){

          suffix[i-1]=  suffix[i]+arr[i-1];

        }
        System.out.println(Arrays.toString(suffix));
    }
}
