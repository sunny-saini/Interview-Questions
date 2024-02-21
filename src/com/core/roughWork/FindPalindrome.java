package com.core.roughWork;

import java.util.Arrays;

public class FindPalindrome {

    public static void main(String[] args) {
        String str="abab";
        int odd=0;
        int arr[]= new int[256];

        for (int i=0;i<str.length();i++){
            arr[str.charAt(i)]++;
        }

        for (int i=0;i<arr.length;i++){
            if((arr[i]&1)==1){
               odd++;
            }

        }
        if (odd>1)
            System.out.println("Not A Palindrome");
        else
            System.out.println("Palindrome");
    }
}
