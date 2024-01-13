package com.core.recursion;

import java.util.Arrays;

import static com.core.intervirew.Main.swap;

public class StringReverse2 {
    static char[] s = "sunny".toCharArray();



    public static void main(String[] args) {

        int i = 0;
        int j = s.length - 1;
         reverseStr2(String.valueOf(s), i, j);
       System.out.println();
    }

    private static void reverseStr2(String s, int i, int j) {

        if (i >j) {
            System.out.println(s);
        }
        swap(s.toCharArray(), i, j);

        i++;
        j--;
         reverseStr2(s, i, j);

    }


}