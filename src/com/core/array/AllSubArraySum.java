package com.core.array;

public class AllSubArraySum {
    public static void main(String[] args) {
        int arr[]={1,2,3};

        int allSum=0;
        for (int i=0;i<arr.length;i++){
            int sum=0;

            for (int j=i;j<arr.length;j++){
                sum=sum+arr[j];
                allSum=allSum+sum;
            }
        }
        System.out.println(allSum);
    }
}
