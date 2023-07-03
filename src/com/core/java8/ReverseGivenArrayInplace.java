package com.core.java8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseGivenArrayInplace {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        reverseInplace(arr);

        String arr2[]={"Sunny","Saini","Apple","Elephent"};

        MAximumLength(arr2);
    }

    private static void MAximumLength(String[] arr2) {

        int maxLength=Arrays.stream(arr2).mapToInt(str-> str.length()).max().orElse(0);
        System.out.println("max length "+ maxLength);
    }

    private static void reverseInplace(int[] arr) {
        IntStream.range(0,arr.length/2).forEach(i->{
            int temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        });
        System.out.println("Revrsed Array : "+ Arrays.toString(arr));
    }
}
