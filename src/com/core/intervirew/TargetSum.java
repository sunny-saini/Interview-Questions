package com.core.intervirew;

public class TargetSum {
    public static void main(String[] args) {
        int arr[]={3,4,6,2,7,9};
        int target=16;
        int p1=0;
        int p2=arr.length-1;

        for(int i=0;i<arr.length;i++){

            if(arr[p1]+arr[p2]==target){
                System.out.println(" i=: "+p1 + "  j=: "+p2);
                return;
            }
            else if(arr[p1]+arr[p2]>target){
                p2--;
            }
            else {
                p1++;
            }

        }


    }
}
