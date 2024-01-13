package com.core.intervirew;

public class TargetMinus {
    public static void main(String[] args) {
        int arr[]={3,5,8,9,12};
        int target=9;
        int p1=0;
        int p2=1;
        while (p2<arr.length){

            if(arr[p2]-arr[p1]==target){
                System.out.println("i : "+p1+  "  j = "+p2);
            }

            if(arr[p2]-arr[p1]>target){
                p1++;


            }
            if(p1==p2)
                p2++;

            else {
                p2++;
            }

        }

    }
}
