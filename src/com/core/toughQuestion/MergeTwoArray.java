package com.core.toughQuestion;

public class MergeTwoArray
{

    public static void main(String[] args) {
     int arr1[] ={1,3,6,9};

     int arr2[]={2,5,7,10};

     int ans[]=new int[arr1.length+arr2.length];


     mergeTwoArray(arr1,arr2,ans);

for (int i=0;i<ans.length;i++){
    System.out.print(" "+ans[i]);
}
     


    }

    private static void mergeTwoArray(int[] arr1, int[] arr2, int[] ans) {
        int i=0;
        int j=0;
        int k=0;

        while (i<arr1.length){
            ans[k++]=arr1[i++];
        }

        while (j<arr2.length){
            ans[k++]=arr2[j++];
        }

    }

}
