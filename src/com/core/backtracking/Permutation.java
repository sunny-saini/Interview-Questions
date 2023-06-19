package com.core.backtracking;

public class Permutation {
    public static void main(String[] args) {
       permute(new char[]{'a','b','c' }, new boolean[26], new char[6], 0);

    }



    static void permute(char A[], boolean vst[],char ans[],int ind){
        if(ind==A.length){
            for(int i=0;i< ans.length;i++){
                System.out.print(" "+ans[i]);
            }
            return;
        }


        for(int i=0;i<A.length;i++){
            int chi = A[i] - 'a';
            if(!vst[chi]){
                vst[chi]=true;
                ans[ind]=A[i];
                permute(A,vst,ans,ind+1);

                vst[chi]=false;
            }
        }
    }
}
