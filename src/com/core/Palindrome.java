package com.core;

public class Palindrome {
    public static void main(String[] args) {
        boolean result = new Palindrome().isPalindrome("sunnynnus");
        System.out.println(result);
    }

    public boolean isPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        s.replaceAll("a-z0-9"," ");

        while(i<j){
            if(s.toLowerCase().charAt(i)!=s.toLowerCase().charAt(j)) {
return false;
            }
                i++;
                j--;

        }
        return true;
    }


    class Solution {
        public boolean isPalindrome(String s) {
            StringBuilder sb = new StringBuilder();
            for(int i =0; i< s.length(); i++){
                char ch = s.charAt(i);
                if (!(Character.isLetterOrDigit(ch))) {
                    continue;
                }
                sb.append(Character.toLowerCase(ch));
            }
            System.out.println(sb.toString());
            System.out.println(sb.length());

            return checkPalindrome(sb.toString(),0,sb.length()-1);
        }

        public boolean checkPalindrome(String s, int start, int end){

            if(start >= end)
                return true;
            if(s.charAt(start) != s.charAt(end))
                return false;

            return checkPalindrome(s,start+1,end-1);


        }
    }
}
