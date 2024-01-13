package com.core.array;

public class Array {
    public static void main(String[] args) {

        int arr[]={-5,4,6,-3,4,-1};
        int arr2[]={-2,-4,-6,-9,-6};

        int maxSum=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++) {
            int sum=0;

        for (int j=i;j< arr.length;j++){

            sum+=arr[j];

            if (sum>maxSum) {
                maxSum = sum;
            }
        }

        }
System.out.println(maxSum);

      int ans=  maxSumSubArray(arr);
        System.out.println(ans);

    }


   static int maxSumSubArray(int arr[]){
        int maxSum=Integer.MIN_VALUE;
        int current=0;
        int i2=0;
        for (int i=0;i<arr.length;i++){

            current+=arr[i];

            if(current>maxSum){
                maxSum=current;
            }
            if(current<0){
                current=0;
            }
        }
        return maxSum;

    }
}
