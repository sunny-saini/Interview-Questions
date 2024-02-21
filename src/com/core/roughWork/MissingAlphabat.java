package com.core.roughWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingAlphabat {
    public static void main(String[] args) {
        String str="BZ";
        List<Character> characterList= new ArrayList<>();
        boolean []arr= new boolean[26];
        for (int i=0;i<str.length();i++){
            if('A'<=str.charAt(i) && str.charAt(i)<='Z')
           arr[str.charAt(i)-'A']=true; // D-A=3
        }

       for (int i=0;i< arr.length;i++){
           if(arr[i]==false){
               characterList.add((char)('A'+i)); // D+3=3
           }
       }
       System.out.println(characterList);
    }
}
