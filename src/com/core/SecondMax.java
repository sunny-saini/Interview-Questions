package com.core;

public class SecondMax {

    public static void main(String[] args) {
        int arr[]={1,2,4,5,6,75,34,34,75,75,75,75,12,9,10,10,1000001};

        int max2=0;
        int max1=0;

        /*for(int i=0;i<arr.length;i++){
            if(max1<arr[i]){
                max2=max1;
                max1=arr[i];
            }
            else if(max2<arr[i] && max1!=arr[i]){
                max2=arr[i];
            }
        }*/

        for(int num:arr){
            if(max1<num){
                max2=max1;
                max1=num;
            } else if (max2<num && max1!=num) {
                max2=num;
            }
        }


        System.out.println("max1 "+max1);
        System.out.println("max2 "+max2);
    }
}
