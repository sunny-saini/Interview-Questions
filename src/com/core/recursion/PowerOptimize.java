package com.core.recursion;

public class PowerOptimize {

    public static void main(String[] args) {

        int n = powerg(2, 8);
        System.out.println(n);

    }

    private static int powerg(int a, int b) {
        if (b == 0)
            return 1;
        if (b == 1)
            return a;

            int ans = powerg(a, b / 2);

            if (b % 2 == 0)
                return ans * ans;
            else
                return a * ans * ans;



    }
}