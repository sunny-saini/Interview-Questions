package com.core.backtracking;

public class PermutationWithFrequency {
    public static void main(String[] args) {
permute(new int[]{2,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,},3,new char[6],0);
    }


    static void permute(int f[],int N, char ans[],int ind){
if(ind==N){
    for(int i=0;i< ans.length;i++){
        System.out.print(" "+ans[i]);
    }
    return;
}


     for(int i=0;i<25;i++){
        if(f[i]>0){
            f[i]-=1;
            ans[ind]=(char)(i+'a');
            permute(f,N,ans,ind+1);
            f[i]+=1;
        }
}
    }
}
