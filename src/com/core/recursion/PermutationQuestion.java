package com.core.recursion;

import java.util.Arrays;



public class PermutationQuestion {
    public static void main(String[] args) {
        PermutationQuestion pr = new PermutationQuestion();
       solve(new int[]{1,2,3,4},0);
    }

    public static void solve(int arr[],int inx){
        if(inx== arr.length-1){
               System.out.println(Arrays.toString(arr));
            //String in = Arrays.toString(arr).replaceAll("\\D+", "");
           // Integer k = Integer.valueOf(in);
            //if(k>1234)
            //    System.out.println(k);

        }
        for (int i=inx;i< arr.length;i++){
           swap(arr,inx,i);
           solve(arr,inx+1);
           swap(arr,inx,i);
        }
    }

    public static void swap(int arr[],int index,int index2){
        int temp=arr[index];
        arr[index]=arr[index2];
        arr[index2]=temp;
    }
}
