package com.core.array;

public class PrintAllSubArray {
    public static void main(String[] args) {
        int arr[]={2,8,-1,4};
        for (int i=0;i< arr.length;i++){
            for (int j=i;j<arr.length;j++){

                for (int s=i;s<=j;s++){
                    System.out.print(arr[s]+" ");
                }
                System.out.println();
            }

        }
    }
}
