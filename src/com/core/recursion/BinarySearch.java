package com.core.recursion;


import java.util.Arrays;



public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={1,3,5,7,9,12,23,45};
        int element=45;
      boolean bi= binarySearch1(arr,0,7,element);
      System.out.println(bi);

    }

    private static boolean binarySearch1(int[] arr, int s, int e, int element) {
        if(s>e){
            return false;
        }
        printStreps(arr,s,e);
        int mid=(s+e)/2;
        if(arr[mid]==element){
            return true;
        }

        if(arr[mid]<element)
           return binarySearch1(arr,mid+1,e,element);
        else
           return binarySearch1(arr,s,mid-1,element);

    }

    private static void printStreps(int[] arr, int s, int e) {
        for (int i=s;i<=e;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();

    }
}
