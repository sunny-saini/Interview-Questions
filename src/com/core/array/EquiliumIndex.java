package com.core.array;

import java.util.Arrays;

public class EquiliumIndex {
   static int arr[]={1, 1, 1};  // 0, 1, 6, 2, -2, 3, 3
    static  int arr2[]={1, 1, 1};
    static int[] evenpreFixSum =new int[arr.length];
    static int[] oddpreFixSum =new int[arr.length];

    public static void main(String[] args) {


      prefixEven(arr);
      prefixOdd(arr);
     int n= specialIndex(arr2);
     System.out.println(n);


    }

    private static int  specialIndex(int[] arr2) {
int N=arr2.length;
int cnt=0;
        for (int i=1;i<N;i++){
            int se = evenpreFixSum[i - 1] + (oddpreFixSum[N - 1] - oddpreFixSum[i]);

            int so= oddpreFixSum[i-1] + (evenpreFixSum[N-1]-evenpreFixSum[i]);

            if(se==so)
                cnt++;
            System.out.println(i);

        }
        return cnt;
    }

    private static void prefixOdd(int[] arr) {
        oddpreFixSum[0]=0;
        for(int i=1;i<arr.length;i++){
            if(i%2==1){
                oddpreFixSum[i]=oddpreFixSum[i-1]+arr[i];
            }
            else {
                oddpreFixSum[i]=oddpreFixSum[i-1];
            }
        }
        System.out.println(Arrays.toString(oddpreFixSum));
    }

    static void prefixEven(int arr[]){
        evenpreFixSum[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            if(i%2==0){
                evenpreFixSum[i]=evenpreFixSum[i-1]+arr[i];
            }
            else {
                evenpreFixSum[i]=evenpreFixSum[i-1];
            }
        }

        System.out.println(Arrays.toString(evenpreFixSum));
    }
}
