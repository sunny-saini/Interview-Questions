package com.core.recursion;

public class PeakMountainArray {
    public static void main(String[] args) {


        int arr[] = {0,10,12,5,2};
        int bi = binarySearchMountain(arr, 0, 3);


        System.out.println(bi);


    }

    private static int binarySearchMountain(int[] arr, int s, int e) {

        if(s>=e){
            return 0;
        }

        int mid=(s+e)/2;

        if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]){
            return mid;
        }

        if(arr[mid]<arr[mid+1]){
           return binarySearchMountain(arr,mid+1,e);
        }
        else {
            return binarySearchMountain(arr,s,mid);
        }

    }

}