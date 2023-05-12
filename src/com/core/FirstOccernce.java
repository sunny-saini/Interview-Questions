package com.core;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstOccernce {


    public static void main(String[] args) {
        Map<Character,Integer> charMap= new LinkedHashMap<>();
        String str="abcdedsassc";
        for(int i=0;i<str.length();i++){

            if(charMap.containsKey(str.charAt(i))){
                charMap.put(str.charAt(i), charMap.get(str.charAt(i))+1);

            }
            else {
                charMap.put(str.charAt(i),1);
            }

        }
        System.out.println(charMap);
        Character ans=null;
        for(Character key: charMap.keySet()){
            if(charMap.get(key)==1){
                ans=  key;
                break;
            }
        }
        System.out.println(ans);
    }


}
