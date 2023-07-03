package com.core.sort;

import java.util.Arrays;

public class SortTwoInOne {
    public static void main(String[] args) {
        int[] result = sorted();
        System.out.println(Arrays.toString(result));
    }

    static int[] sorted(){
        int a[]={-1,2,6};
        int b[]={3,4,5};
        int []c= new int[a.length+b.length];

        int j = 0;
        for (int i=0;i<a.length;i++){

            c[j++]=a[i];
        }

        for (int i=0;i<b.length;i++){

            c[j++]=b[i];
        }
        return c;
    }
}
