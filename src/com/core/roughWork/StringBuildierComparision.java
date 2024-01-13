package com.core.roughWork;

public class StringBuildierComparision {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("sunny");
        StringBuilder sb1= new StringBuilder("sunny");

        System.out.println(sb.toString().equals(sb1.toString()));
        int result = sb.compareTo(sb1);
        if(result==0){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}
