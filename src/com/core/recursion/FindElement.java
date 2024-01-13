package com.core.recursion;

public class FindElement {
    public static void main(String[] args) {
        int arr[]={2,4,5,7,8};
        int elment=4;
     String outcome=  findElement(arr,arr.length-1,elment);
     System.out.println(outcome);
    }

    private static String findElement(int[] arr, int length, int elment) {
        if(length<0){
            return "Not Present";
        }

        else if(arr[length]==elment){
            return "Present";
        }
        else {
          return   findElement(arr,length-1,elment);
        }

    }
}
