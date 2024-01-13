package com.core.recursion;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int arr[]={9,4,6,7,3,1};
        mergeSort(arr,0,arr.length-1);

        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i] +" ");
        }
    }

    private static void mergeSort(int[] arr, int s, int e) {

        if(s>=e){
            return;
        }
        int mid=  (s + e)/2;
        mergeSort(arr,s,mid);
        mergeSort(arr,mid+1,e);
        
        
        merge(arr,s,e);

    }

    private static void merge(int[] arr, int s, int e) {
        int mid=s+(e-s)/2;
        int len1= mid-s+1;             // s=mid+1;
        int len2= e-mid;                     // e=mid-1;

        int first[]=new int[len1];
        int second[]= new int[len2];

        //coyping the elemnt from arr to first and second array

        int mainArrayIndex=s;

        for(int i=0;i<len1;i++){
            first[i]=arr[mainArrayIndex++];
        }

        for(int i=0;i<len2;i++){
            second[i]=arr[mainArrayIndex++];
        }

        //merge two sorted array
        int index1=0;
        int index2=0;
        mainArrayIndex = s;

        while (index1<len1 && index2<len2) {

            if (first[index1] < second[index2]) {
                arr[mainArrayIndex++] = first[index1++];
            } else {
                arr[mainArrayIndex++] = second[index2++];
            }
        }
            while (index1<len1){
                arr[mainArrayIndex++]=first[index1++];
            }
            while (index2<len2){
                arr[mainArrayIndex++]=second[index2++];
            }



    }
}
