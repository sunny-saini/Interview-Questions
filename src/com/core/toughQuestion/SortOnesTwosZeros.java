package com.core.toughQuestion;

import java.util.Arrays;
/*
int low=0;
int mid=0;
int high=arr.length()-1;
int temp=0

while(mid<=high){

switch(arr[mid]){          0,1,1,0,2,2,2,2,2 //001122222

case 0: temp= arr[low];
         arr[low]=arr[mid];
          arr[mid]=temp;

         low++; mid++;    mid =4, low=2;
    break;

case 1:
mid++;
break;


case 2:
temp=arr[mid];
arr[mid]=arr[high];
arr[mid]=temp;
h--;
break;

 */

public class SortOnesTwosZeros {
    public static void main(String[] args) {
        int arr[]={1,1,1,2,0,0,0,0,1,1,1,2,0};
        int low=0;
        int mid=0;
        int high=arr.length-1;
        int temp=0;

        while (mid<=high)
            switch (arr[mid]){
                case 0: {
                    temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                    break;
                }
                case 1:
                    mid++;
                    break;

                case 2:{
                    temp=arr[mid];
                    arr[mid]=arr[high];
                    arr[high]=temp;
                    high--;
                    break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
