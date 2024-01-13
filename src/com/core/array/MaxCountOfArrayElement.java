package com.core.array;

public class MaxCountOfArrayElement {
    public static void main(String[] args) {

        int arr[]={2,3,10,7,3,10,8};

        int maxVal=arr[0];
        int count=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxVal)
                maxVal=arr[i];

            if(maxVal==arr[i])
                count++;
        }
        System.out.println(maxVal);
        System.out.println(count);



    }
}
