package com.core.recursion;

public class GetSum {
    public static void main(String[] args) {
        int arr[]={3,4,5,8,9,7};
       int ans= getSum(arr,arr.length-1);
        System.out.println(ans);
    }

    private static int getSum(int[] arr, int size) {
        if(size<0)
            return 0;
        return arr[size]+getSum(arr,size-1);
    }
}
