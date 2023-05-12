package com.core;

import java.util.ArrayList;
import java.util.List;

public class MissingPrint {
    public static void main(String[] args) {
        List<Character> output = new MissingPrint().missingElement(List.of('A', 'B','Z'));

    }

    List<Character> missingElement(List<Character> ch) {
        List<Character> characters= new ArrayList<>();
        boolean arr[]= new boolean[26];
        for(int i=0;i<ch.size();i++){
            if('A'<=ch.get(i)&& ch.get(i)<='Z'){
                arr[ch.get(i)-'A']=true;
            }
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]==false){
                characters.add((char) (i +'A'));
            }
        }


        return characters;

    }
}


