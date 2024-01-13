package com.core.array;

public class AG_Calculation {
    public static void main(String[] args) {
      int result=  AG_Calculation.solve("ABCGAG");
    System.out.println(result);
    }

    public static int solve(String A) {
      A= A.toLowerCase();
        int N=A.length();
        int ans=0;
        int ag=0;

        for(int i=N-1;i>=0;i--){
            if(A.charAt(i)=='g')
                ag++;

            else if(A.charAt(i)=='a')
                ans+=ag;

        }
        return ans;
    }
}
