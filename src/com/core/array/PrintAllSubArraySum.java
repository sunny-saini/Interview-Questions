package com.core.array;

public class PrintAllSubArraySum {
    public static void main(String[] args) {
        int arr[]={2,8,-1,4};
        int allSum=0;
        for (int i=0;i< arr.length;i++){
            int sum=0;
            for (int j=i;j<arr.length;j++) {

                sum=sum+arr[j];

                System.out.println(sum);
            }

            //System.out.println();
            }
    }


}
