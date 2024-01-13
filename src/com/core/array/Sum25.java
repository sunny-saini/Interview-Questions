package com.core.array;

public class Sum25 {
    public static void main(String[] args) {
        int arr[]={23,2,12,56,22,3};

        for (int i=0;i<arr.length-1;i++){
            if(arr[i]+arr[i+1]==25){
                System.out.println(arr[i] +" & "+arr[i+1]);
            }
        }
    }
}
