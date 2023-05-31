package com.core.dsalgo;

public class BinarySearch {
    public static void main(String[] args) {
        //         0,1,2,3,4,5,6,7,8,9,10,11
        int arr[]={1,4,6,7,12,37,45,56,67,89,90};
        int target=67;
      int index=findByBinarySearch(arr,target);
        System.out.println(index);

    }

   static int findByBinarySearch(int arr[],int target){
        int l=0;
        int h=arr.length-1;

        while (l<=h){
            int mid=l+(h-l)/2;//6+(10-6)/2=
            if(arr[mid]==target){
                return target;
            }

            if(arr[mid]<target){
                l=mid+1;
            }
            else
                h=mid-1;
        }
        return target;

    }

}
