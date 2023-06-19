package com.core;

public class Palondone {
    public static void main(String[] args) {
        System.out.println(check("aaab"));
    }

    static boolean check(String str){
        int noOfChar=256;
        int arr[]= new int[noOfChar];
        for (int i=0;i<str.length();i++){
            arr[str.charAt(i)]++;
        }
        int odd=0;
        for (int i=0;i<noOfChar;i++){
            if((arr[i]&1)==1){
               odd++;
            }
            if(odd>1)
                return false;
        }
        return true;
    }
}
