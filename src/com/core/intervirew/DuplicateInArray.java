package com.core.intervirew;

import java.util.Arrays;

public class DuplicateInArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,3,4,5,6,5,4};
        Arrays.sort(arr);
        int i=1;
        int j=1;
        while (i !=arr.length){
            if(arr[i]!=arr[i-1]){
                arr[j]=arr[i];
                j++;
            }
            i++;
        }

        for(int k=0;k<j;k++){
            System.out.print(arr[k]+" ");
        }
    }
}
