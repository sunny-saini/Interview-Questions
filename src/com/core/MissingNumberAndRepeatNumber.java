package com.core;

import java.util.HashMap;
import java.util.Map;

public class MissingNumberAndRepeatNumber {

    public static void main(String[] args) {
        new MissingNumberAndRepeatNumber().missAndRepaet(new int[]{7, 3, 4, 5, 5, 6, 2});
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
}

