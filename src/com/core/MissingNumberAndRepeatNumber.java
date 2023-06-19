package com.core;

import java.util.HashMap;
import java.util.Map;

public class MissingNumberAndRepeatNumber {

    public static void main(String[] args) {
     //   new MissingNumberAndRepeatNumber().missAndRepaet(new int[]{7, 3, 4, 5, 5, 6, 2});

       int result= firstMissingPositive(new int[] {1,2,3,4,5,6,7,8,9});
       System.out.println(result);
    }

    void missAndRepaet(int arr[]) {

        int temp[]=new int[arr.length];

        int missingNum=-1;
        int repeatingNum=-1;

        for(int i=0;i<arr.length;i++){
            temp[arr[i]-1]++;
            if(temp[arr[i]-1]>1){
                repeatingNum=arr[i];
            }
        }
        System.out.println(repeatingNum);

        for(int i=0;i<arr.length;i++){
            if(temp[i]==0){
                missingNum=i+1;
                break;
            }
        }
        System.out.println(missingNum);

    }

    public static int firstMissingPositive(int[] A) {

        int temp[]=new int[A.length+1];

        for(int i=0;i<A.length;i++){
            if(A[i]<0 || A[i]>A.length)
                continue;
            temp[A[i]]++;
        }

        for(int i=1;i<temp.length;i++){

            if(temp[i]==0)
               return i;
        }

        return A.length+1;
    }
}

