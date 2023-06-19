package com.core.recursion;

public class Factorial {

    public static void main(String[] args) {
     int   result=new Factorial().factro(5);
     System.out.println(result);
    }

    int fact(int n){
        if(n==0)
            return 1;

        return n*fact(n-1);
    }


    int factro(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
}
