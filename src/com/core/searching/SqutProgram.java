package com.core.searching;

public class SqutProgram {
    public static void main(String[] args) {


        int root = squtNum(37);
        double ans = morePercision(37, 6, root);
        System.out.println(ans);
    }
    private static int squtNum(int num) { //6.0827625303
        int s=0;
        int e=num;
        int ans=-1;
        while (s<=e){
            int mid=s+(e-s)/2;
            int square =mid*mid;

            if(square==num){
                return mid;
            }
           if(square<num){
                ans=mid;
               s=mid+1;
           }else {
               e=mid-1;
           }
        }
return ans;
    }

   static double morePercision(int n, int presion, int tempSol){
        Double factor=1.0;
       Double ans= (double) tempSol;

        for(int i=0;i<presion;i++){
            factor=factor/10;

            for (double j=ans;j*j<n; j=j+factor){
                ans=j;
            }
        }
return ans;
   }
}
