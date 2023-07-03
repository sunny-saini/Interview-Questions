package com.core.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommaonElement {
    public static void main(String[] args) {
         int arr1[]={34,56,23,78,1,2};
        int arr2[]={4,6,2,7,1,2};

        fetchCommanElement2(arr1,arr2);

    }

    private static void fetchCommanElement2(int[] arr1, int[] arr2) {
        List<Integer> listCommon= Arrays.stream(arr1).filter(e-> Arrays.stream(arr2).anyMatch(e1->e1==e)).boxed().collect(Collectors.toList());
   System.out.println(listCommon);
    }







    private static void fetchCommanElement(int[] arr1, int[] arr2) {

        List<Integer> list = Arrays.stream(arr1).filter(ele -> Arrays.stream(arr2).anyMatch(arr2num -> arr2num == ele)).boxed().collect(Collectors.toList());
   System.out.println(list);
    }


}
