package com.core.array;


import java.util.Arrays;

public class ReverseArray
{
   static int arr[] = {-3, 4, 2, 8, 7, 9, 6, 2, 10};
    public static void main(String[] args) {


     //   int arr[] = {-3, 4, 2, 8, 7, 9, 6, 2, 10};
        int N = arr.length;
        int s = 0;
        int e = arr.length - 1;
        reverse(arr, s, e);
        System.out.println(Arrays.toString(arr));

    }

    private static void reverse(int[] arr ,int s, int e) {

        int i=s;
        int j=e;
        while (i<j){
          //  swap(arr[i],arr[j],arr);
            final int temp = arr[i];

            arr[i] = arr[j];

            arr[j] = temp;
            i++;
            j--;
        }




    }

    private static void swap(int s, int e,int arr[] ) {

        final int temp = arr[s];

        arr[s] = arr[e];

        arr[e] = temp;


    }
}
