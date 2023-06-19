package com.core.string;

import java.util.Arrays;

public class CheckAnySequencePalindrome {
    public static void main(String[] args) {
        String str="aabbe";//aabebaa
     boolean re= checkpalin(str);
     System.out.println(re);


    }

    static boolean checkpalin(String str){
        int count[]=new int [256];


     //   Arrays.fill(count,0);

        for (int i=0;i<str.length();i++)
            count[ (str.charAt(i))]++;

        int odd=0;

        for (int i=0;i<256;i++){
            if((count[i]&1)==1){
                odd++;
            }
            if(odd>1)
                return false;
        }
        return true;
    }
}
