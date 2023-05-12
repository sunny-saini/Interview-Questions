package com.core.recursion;

public class Fibonnanci {
    public static void main(String[] args) {
     int  result= new Fibonnanci().finnoci(6);
     System.out.println(result);
    }

    int finnoci(int n){
        if(n==1 || n==0) {
            return 1;
        }

        return finnoci(n-1) + finnoci(n-2);
    }
}
