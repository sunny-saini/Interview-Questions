package com.core;

public class DuplicateInArray {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,6,7,8,8};

        int temp[]=new int[arr.length];

        for(int i=0;i<arr.length;i++){
            temp[arr[i]-1]++;
            if(temp[arr[i]-1]>1){
                System.out.println(arr[i]);
            }
        }
    }
}
