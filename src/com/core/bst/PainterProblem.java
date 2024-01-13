package com.core.bst;

public class PainterProblem {
   static int arr[]={5,3,6,1,9};
    public static void main(String[] args) {

        int max=0;
        int sum=0;
        int p=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max)
                max=arr[i];
              sum+=arr[i];
        }
        int l=max*2;
        int r=sum*2;
        while (l<=r){
           int mid=l+(r-l)/2;

          int  cnt=countPianter(mid);
            int cnt1 = countPianter(mid - 1);

            if(cnt<=p && cnt1>p){
                 // return mid;
            }

            if(cnt<=p){
                r=mid-1;
            }
            else {
                l=mid+1;
            }


        }


    }

    private static int countPianter(int mid) {
        int p=1;
        int time=2;
        int x=20;
        for(int i=0;i<arr.length;i++) {
            if (arr[i]*time >x){
               return -1;

            } else if (time+arr[i]*time<=x) {
                time+=arr[i]*time;

            }
            else {
                p+=1;
                time=arr[i]*time;
            }

        }
     return p;
    }
}
