package com.core.roughWork;

public class MisRep {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,7};
        int repet=-1;
        int miss=-1;

        int arrOccer[]= new int[arr.length];

        for (int i=0;i<arr.length;i++){
            arrOccer[arr[i]-1]++;
        }

        for(int i=0;i<arrOccer.length;i++){
            if((arrOccer[i])>1){
                repet=i+1;
            }
            if(arrOccer[i]==0){
                miss=i;
            }
        }
        System.out.println(repet);
        System.out.println(miss);

    }
}
