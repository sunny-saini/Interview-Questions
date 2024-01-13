package com.core.roughWork;

import java.util.Arrays;

public class ZeroAndOnes {
    public static void main(String[] args) {
        int[] array = { 0, 1, 0, 1, 1, 0, 0, 1, 1,0 };

     /*   int j=-1;
        for (int i=0;i<array.length;i++){
            if(array[i]<1){
                j++;
                int temp=array[i];
                array[i]=array[j];
                array[j]=temp;
            }
        }

        System.out.println(Arrays.toString(array));
*/

        int j1=array.length;
        for (int i= array.length-1;i>=0;i--){
            if(array[i]>0){
                j1--;
                int temp=array[i];
                array[i]=array[j1];
                array[j1]=temp;
            }
        }
        System.out.println(Arrays.toString(array));

    }
}
