package com.core.recursion;

public class Fibonnanci {
    public static void main(String[] args) {
     int  result= new Fibonnanci().finnocii(6);
     System.out.println(result);
    }

    int finnoci(int n){
        if(n==1 || n==0) {
            return 1;
        }

        return finnoci(n-1) + finnoci(n-2);
    }

    int finnocii(int n){
        int n1=0;
        int n2=1;

        int result=1;
        for(int i=1;i<=n;i++){
           result=n1+n2;

           n1=n2;
           n2=result;

        }
       return result;
    }
}
