package com.core.array;// Java program to find longest
// contiguous subsequence

import java.util.*;

class LongestConsectiveSubSequenceLength {

    static int findLongestConseqSubseq(int arr[]) {

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        int max_sequence_length = 0;
        for (int i = 0; i < arr.length; i++) {
            int current_num = arr[i];
            int current_sequence_length = 1;

            if (!set.contains(current_num - 1)) {
                while (set.contains(current_num + 1)) {
                    current_num += 1;
                    current_sequence_length += 1;
                }

                max_sequence_length = Math.max(max_sequence_length, current_sequence_length);
            }
        }


        return max_sequence_length;
    }

    // Driver code
    public static void main(String[] args) {
        int arr[] = {1, 9, 3, 10, 4, 20, 2};
        int n = arr.length;

        System.out.println(
                "Length of the Longest "
                        + "contiguous subsequence is "
                        + findLongestConseqSubseq(arr));
    }
}

// This code is contributed by parascoding
