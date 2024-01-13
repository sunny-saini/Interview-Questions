package com.core.recursion;

public class SayDigit {

    void saydigit(int n, String arr[]){
        if(n==0)
            return;
        int dight=n%10;
        n=n/10;

        saydigit(n,arr);
        System.out.println(arr[dight]);

    }

    public static void main(String[] args) {
        String arr[]= {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};

        new SayDigit().saydigit(450,arr);

    }
}
