package com.core.array;

import java.util.Arrays;

public class PrefixSum {
    public static void main(String[] args) {
        int[] array = {2,3,3,-6,3,3,-6,6,-3,4,-4};
        int[] prefixSum = new int[array.length];

        // Compute the prefix sum
        prefixSum[0] = array[0];
        for (int i = 1; i < array.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + array[i];
        }

        // Calculate the sum of elements in the range [L, R]
        int L = 3;
        int R = 6;
        int sumInRange = prefixSum[R] -(L>0 ?   prefixSum[L - 1] :0) ;

       System.out.println("Sum in range [" + L + ", " + R + "]: " + sumInRange);

    }
}
