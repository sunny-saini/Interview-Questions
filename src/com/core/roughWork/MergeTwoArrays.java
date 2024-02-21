package com.core.roughWork;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.IntStream.concat;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int arr1[]={1,3,5,7,9,11,45};
        int arr2[]={10,34,68,43,69,70};

        int merge[]=new int[arr1.length+ arr2.length];
        int ind1=0;
        int ind2=0;
        int i=0;
        while (ind1< arr1.length && ind2< arr2.length){
            if(arr1[ind1]<arr2[ind2]){
                merge[i++]=arr1[ind1++];
            }
            else {
                merge[i++]=arr2[ind2++];
            }
        }

        while (ind1<arr1.length){
            merge[i++]=arr1[ind1++];
            System.out.println("11");
        }
        while (ind2<arr2.length){
            merge[i++]=arr2[ind2++];
        }

        System.out.println(Arrays.toString(merge));


        List<Integer> arr = concat(Arrays.stream(arr1), Arrays.stream(arr2)).sorted().distinct().boxed().collect(Collectors.toList());

        System.out.println(arr);
    }
}
