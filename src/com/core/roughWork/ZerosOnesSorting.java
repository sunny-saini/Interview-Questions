package com.core.roughWork;

import java.util.Arrays;

public class ZerosOnesSorting {
    public static void main(String[] args) {
        int arr[] = {0, 0, 0, 1, 0, 0, 1, 1, 1};

       // int j = -1;
        int j=arr.length;
        for (int i = arr.length-1; i >=0; i--) {
           /* if(arr[i]<1 ){
                j++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
*/
            if (arr[i] > 0) {
                j--;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;

            }

        }

        System.out.println(Arrays.toString(arr));
    }

}