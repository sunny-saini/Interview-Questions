package com.core.array;

public class SwapNumberWithFunction {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("a=" + a + ",b=" + b);
 
        a = getB(b,b=a);
 
        System.out.println("a=" + a + ",b=" + b);
    }
     
    public static int getB(int b,int a) {
        return b;
    }
}