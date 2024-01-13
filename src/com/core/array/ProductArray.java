package com.core.array;

import java.util.Arrays;

public class ProductArray {
    public static void main(String[] args) {
System.out.println(Arrays.toString(solve(new int[] {1, 2, 3, 4, 5})));
    }


    public static int[] solve(int[] A) {

        int product = 1;
        for (int i = 0; i < A.length; i++) {
            product = product * A[i];
        }

        for (int i = 0; i < A.length; i++) {

            A[i] = product / A[i];

        }

return A;
    }

}