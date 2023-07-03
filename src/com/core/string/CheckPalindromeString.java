package com.core.string;

public class CheckPalindromeString {
    public static void main(String[] args) {
       System.out.println(checkPal("aabaa"));
    }

    static boolean checkPal(String str){
        int s=0;
        int l=str.length()-1;

        while (s<=l){
            if(str.charAt(s)!=str.charAt(l)){
                return false;

            }
            s++;
            l--;
        }
        return true;
    }
}
