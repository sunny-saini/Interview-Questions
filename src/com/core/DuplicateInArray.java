package com.core;

import java.util.ArrayList;
import java.util.List;

public class DuplicateInArray {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,6,7,8,8};
        List<Integer> list= new ArrayList<>();
        int temp[]=new int[arr.length];

        for(int i=0;i<arr.length;i++){
            temp[arr[i]-1]++;
            if(temp[arr[i]-1]==1){
               // System.out.println(arr[i]);
                list.add(arr[i]);
            }
        }
        System.out.println(list);
    }
}
