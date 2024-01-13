package com.core.searching;

public class BSearch {

    public static void main(String[] args) {
//int result=BSearch.search(new int[]{3,6,9,12, 14,19,20,23,25,27,3034,38,40,45},12);

//int result=BSearch.floorOfGivenElement(new int[]{3,6,9,12, 14,19,20,23,25,27,3034,38,40,45},21);

int arr[]={-5,-5,-3,-3,0,0,1,1,5,5,5,5,5,5,8,10,10,15};

int first=BSearch.firstOccerence(arr,5);
        int last=BSearch.lastOccerence(arr,5);
System.out.println(last-first+1);




    }
 static    int search(int arr[], int k){
        //int n=arr.length-1;
        int l=0;
        int h=arr.length-1;

        while (l<=h){
            int mid=(l+h)/2;
            if(arr[mid]==k)
                return mid;

            else if(arr[mid]<k){
                l=mid+1;
            }
            else {
                h=mid-1;
            }

        }
return -1;
    }


    static int floorOfGivenElement(int arr[],int k){
        int l=0;
        int h=arr.length-1;
int ans=0;
        while (l<=h){
            int mid=(l+h)/2;

            if(arr[mid]==k){
                return arr[mid];
            } else if (arr[mid]<k) {
                ans=arr[mid];
                l=mid+1;
            }
            else
                h=mid-1;
        }
        return ans;
    }

    static int firstOccerence(int arr[],int k){
        int l=0;
        int h=arr.length-1;
        int ans=0;

        while (l<=h){
            int mid=(l+h)/2;

            if(arr[mid]<k){
                l=mid+1;

            } else if (arr[mid]>k) {
                h=mid-1;
               // ans=mid;
            }
            else {
               ans=mid;
                h=mid-1;

            }
        }
        return ans;
    }

    static int lastOccerence(int arr[],int k){
        int l=0;
        int h=arr.length-1;
        int ans=0;

        while (l<=h){
            int mid=(l+h)/2;

            if(arr[mid]<k){
                l=mid+1;


            } else if (arr[mid]>k) {
                h=mid-1;

            }
            else if(arr[mid]==k){
               ans=mid;
                l=mid+1;

            }

        }
        return ans;
    }


}
