package com.core.array;

import java.util.Arrays;

public class SortingOfRepetedNum {
    public static void main(String[] args) {
        int arr[] = {0, 1, 1, 0, 2, 2, 2, 2, 2};

        int[] ans = new SortingOfRepetedNum().sort(arr);
        System.out.println(Arrays.toString(ans));
    }


    public int[] sort(int arr[]) {

        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        int temp = 0;

        while (mid <= high) {

            switch (arr[mid]) {          //0,1,1,0,2,2,2,2,2 //001122222

                case 0:
                    temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;

                    low++;
                    mid++;
                    break;

                case 1:
                    mid++;
                    break;


                case 2:
                    temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                    break;

            }
        }
return arr;
    }
}