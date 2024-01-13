package com.core.recursion;

public class ReverseString {
    public static void main(String[] args) {
        String str="saini";
        System.out.println(reverseStr(str));
    }

    private static String reverseStr(String str) {
        if(str==null || str.length()<=1)
            return str;
        else
            return reverseStr(str.substring(1)) + str.charAt(0);

    }
}
