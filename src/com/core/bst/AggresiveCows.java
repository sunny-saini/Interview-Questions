package com.core.bst;

public class AggresiveCows {
    public static void main(String[] args) {
        int arr[]= {1,3,4,8,10,12,17};
        int D=3;
        int count=1;
        int location=arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]-location>=D){
                count++;
                location=arr[i];
            }
        }
        System.out.println(count);
    }
}
