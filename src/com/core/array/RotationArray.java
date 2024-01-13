package com.core.array;

import java.util.Arrays;
import java.util.Scanner;

public class RotationArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int arr[] = new int[N];

        for (int i = 0; i < N; i++) {

            arr[i] = sc.nextInt();

        }
        int shift = sc.nextInt();
        shift = shift % N;

        for (int i1 = 0; i1 < shift; i1++) {
            int li = arr.length - 1;
            int lastEle = arr[li];
            for (int i = 0; i < arr.length - 1; i++) {
                if (i == 0) {
                    arr[li] = arr[0];

                }


                arr[i] = arr[i + 1];
            }
            arr[arr.length - 2] = lastEle;
            System.out.println(Arrays.toString(arr));
        }
    }

}
