package com.core.sort;

import java.util.Arrays;

/*
TC= O(n2)
SC=O(1)

Inplace & Stable



Givin N array
elements Find the
kth smallest element
 */
public class BubbleSort {
    public static void main(String[] args) {
int result[]=bubSort(new int []{6, 5, 4, 30, 2, 1});
        System.out.println(Arrays.toString(result));

    }

    static int [] bubSort(int arr[]){
        for (int i=0;i<arr.length-1;i++){
            boolean flag=false;

            for (int j=0;j<(arr.length-i-1);j++){
                if(arr[j+1]<arr[j]){

                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    flag=true;

                }
            }
               if(!flag)
               break;;
        }
return arr;
    }
}
