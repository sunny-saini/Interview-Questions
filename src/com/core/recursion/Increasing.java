package com.core.recursion;

public class Increasing {
    public static void main(String[] args) {
    new Increasing().printnum(5);
    }

    void printnum(int n){

        if(n==0){
            return;
        }
      //  System.out.println(n); for Decreasing Order
        printnum(n-1);
        System.out.println(n);
    }
}
