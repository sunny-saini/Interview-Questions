package com.core.roughWork;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int arr[]=new int[]{6,4,3,2,8,1};
      mergeSort(arr, 0, arr.length - 1);
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i] +" ");
        }
    }

    private static void mergeSort(int[] arr, int start, int end) {
        int si=start;
        int ed= end;
if(start>=ed)
    return;
        int mid= si+ed/2;

        mergeSort(arr,si,mid);
        mergeSort(arr,mid+1,ed);
        conqure(arr,si,mid,ed);
    }

    private static void conqure(int[] arr, int si, int mid, int ed) {
        int ind1=si;
        int ind2=ed;
        int x[]=new int[arr.length];
        int ind3=0;

        while (ind1<mid && mid<ed){
            if(ind1<mid){
                x[ind3++]=arr[ind1++];
            }
            else {
                x[ind3++]=arr[ind2++];
            }
        }

        while (ind1<mid){
            x[ind3++]=arr[ind1++];
        }
        while (mid<ed){
            x[ind3++]=arr[ind2++];
        }

        for (int i=0,j=si;i<arr.length;i++,j++){
            arr[j]=x[i++];
        }

    }
}
