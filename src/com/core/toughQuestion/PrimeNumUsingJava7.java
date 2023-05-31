package com.core.toughQuestion;

public class PrimeNumUsingJava7{
    public static void main(String[] args) {


        boolean ans = new PrimeNumUsingJava7().prime(2);
        printPrimenum(19);
        //System.out.println(ans);
    }

    static void printPrimenum(int n){
        for(int i=2;i<n;i++){
            if(prime(i)==true){
                System.out.println(i);
            }
        }
    }

   static boolean prime(int num) {
    for (int i = 2; i < num; i++) {
        if (num % i == 0) {
            return false;

        }
    }

return true;
    }
}
