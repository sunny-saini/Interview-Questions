package com.core.hclquestion;

public class ReverseNumWithoutLibraryFun {
    public static void main(String[] args) {
        int a=1234567;
int sum=0;
        while(a>0){//7654321
          int digit= a%10;
           sum=sum*10+digit;
           a=a/10;

        }
        System.out.println(sum);
    }
}
