package com.core.intervirew;

import java.util.Arrays;

public class FirstOccerenceAndLast {
    public static void main(String[] args) {
        int[] ans = findOccerence(new int[]{2,3,3,3,4,5,7,9,9,9,9}, 3);
        System.out.println(Arrays.toString(ans));
    }



   static int[] findOccerence(int arr[], int target){

        int firstOccerence=0;
        int lastOccerence=0;
        for(int i=0;i<arr.length;i++) {

            if (arr[i] == target) {

                firstOccerence = i;                   //   Time Compexity= O(n)+O(n)=O(n)=O(logn)

                break;
            }
        }

            for(int i=0;i<arr.length;i++){

                if(arr[i]==target){

                    lastOccerence=i;// end up to last occernce value

                }

            }


        return new int[]{firstOccerence,lastOccerence};

    }

}
