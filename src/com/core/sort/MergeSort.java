package com.core.sort;

import java.util.Arrays;

public class MergeSort {


    public static void main(String[] args) {
        int[] result = solve(new int[]{7, 5, 4, 3, 2,1});
        System.out.println(Arrays.toString(result));
    }
    public  static int[] solve(int[] A) {

        return divide(A, 0, A.length-1);
    }

    static int[] divide(int arr[], int si, int ei) {
        int mid= si+(ei-si)/2;
        if(si>=ei) return arr;

        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        return conqure(arr, si,mid,ei);

    }

    private static int[]  conqure(int arr[], int si, int mid, int ei) {

        int merge[]= new int [ei-si+1];
        int inx1=si;
        int inx2=mid+1;
        int x=0;

        while(inx1<=mid && inx2<=ei) {
            if(arr[inx1] <=arr[inx2])
                merge[x++]=arr[inx1++];

            else
                merge[x++]=arr[inx2++];

        }

        while(inx1<=mid)
            merge[x++]=arr[inx1++];

        while(inx2<=ei)
            merge[x++]=arr[inx2++];

        for(int i=0;i<merge.length;i++) {

            arr[si+i]=merge[i];
        }
        return arr;

    }
}


