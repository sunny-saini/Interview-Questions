package com.core.array;

import java.util.Arrays;

public class PrefixArray {
  static   int[] array = {1, 2, 3};
  static int[] prefix;
    public static void main(String[] args) {
       // int []arr={10,4,5,6,9};
       prefix=new int[array.length];

         prefix[0]=array[0];
        for(int i=1;i<array.length;i++){

            prefix[i]= prefix[i-1]+array[i];

        }

        for (int i=1;i<array.length;i++){
            int sl=prefix[i-1];
            int sr= prefix[array.length-1]-prefix[i];
            if (sl==sr){
                System.out.println("i := "+i);
            }
        }


      //  System.out.println(Arrays.toString(prefix));
    }
}
