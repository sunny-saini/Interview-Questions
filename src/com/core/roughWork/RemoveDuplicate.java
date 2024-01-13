package com.core.roughWork;

import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int arr[]={0, 0, 1, 1, 1, 2, 2, 3, 3, 4,4};
       arr= removedup(arr);
         System.out.println(Arrays.toString(arr));
    }

   static int [] removedup(int arr[]){
        int currentIndex=0;

        for (int i=1;i<arr.length;i++){
            if(arr[i]!=arr[currentIndex]){
                currentIndex++;
                arr[currentIndex]=arr[i];
            }
        }
      return   arr= Arrays.copyOfRange(arr,0,currentIndex+1);
    }
}
