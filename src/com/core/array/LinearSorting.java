package com.core.array;

import java.util.Arrays;

public class LinearSorting {

    public static void main(String[] args) {
        int arr[]=new int[]{0,1,0,1,1,2,2,2,0,0,0};
        sort(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int arr[]){

        int zero=0;
        int one=0;

        for(int value :arr){
            if(value==0)
                zero++;
        }

        for(int value :arr){
            if(value==1)
                one++;
        }

        int k=0;
     while (zero-- !=0){
         arr[k++]=0;
     }

        while (one-- !=0){
            arr[k++]=1;
        }


     while (k< arr.length){
         arr[k++]=2;
     }


    }

}
