package com.core.searching;

public class SearchRotatedArray {
    public static void main(String[] args) {
        int arr[] = {1, 3, 8, 10, 5,3};
        int k=2;
        int re=findPostion(arr,k,arr.length);
        System.out.println(re);
    }

    private static int findPostion(int[] arr, int n,int k) {
        int pivot=getPivot(arr,n);
        if(k>arr[pivot] && k<arr[n-1]){
            return binarySearch(arr,pivot,n-1,k);
        }
        else {
            return binarySearch(arr,0,pivot-1,k);
        }


    }

    private static int getPivot(int[] arr, int n) {
        int s=0;
        int e=n-1;
        int mid=s+(e-s)/2;
        while (s<e){
            if(arr[mid]>=arr[0]){
                s=mid+1;
            }
            else {
                e=mid;
            }

            mid=s+(e-s)/2;
        }
        return s;
    }

    static int binarySearch(int arr[],int s, int e,int n) { //1,2,3,4,5,6

        int si = s;
        int ei = e;


        while (si <= ei) {
            int mid = si + (ei - si) / 2;
            if (arr[mid] == n) {
                return mid;
            }

            if (arr[mid] < n)
                si = mid + 1;

            else
                ei = mid - 1;
        }
        return -1;
    }
    }
