package com.core.searching;

public class BinarySearch {
    public static void main(String[] args) {
//int result=binarySearch(new int[]{1,2,3,4,5,6,77,88,90},77);
//System.out.println(result);

int ans=BinarySearch.freq(new int[]{1,2,3,4,4,5,6},4);
        System.out.println(ans);
    }

    static int binarySearch(int arr[],int n){ //1,2,3,4,5,6

        int si=0;
        int ei=arr.length-1;


        while(si<=ei){
            int mid=si+(ei-si)/2;
            if(arr[mid]==n){
                return mid;
            }

            if(arr[mid]<n)
                si=mid+1;

            else
                ei=mid-1;
        }
        return -1;

    }

    static  int freq(int arr[], int k){
        int l=0;
        int h=arr.length-1;
        int ans=0;

        while (l<=h){  // 1,2,3,4,4,5,6
            int mid=(l+h)/2;





        }
        return ans;



    }
}
