package com.core.roughWork;

public class BSearch {
    public static void main(String[] args) {
        int arr[]={-1,0,3,5,9,12};
        int target=9;
        int ans=0;
        int s=0;
        int e=arr.length-1;


        while (s<=e){
            int mid= s+(e-s)/2;
            if(arr[mid]==target){
                ans=mid;
                return;
            }
            else if(arr[mid]<target){
                s=mid+1;
            }
            else {
                e=mid-1;
            }

        }
        System.out.println(" ans"+ans);
    }
}
