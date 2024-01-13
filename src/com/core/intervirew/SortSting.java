package com.core.intervirew;

import com.core.oop.Inheri;

import java.util.*;
import java.util.stream.Collectors;

/*Given a string s, sort it in decreasing order based on the frequency of the characters.
        The frequency of a character is the number of times it appears in the string.
*/
public class SortSting {
    public static void main(String[] args) {
        String str="sunnnys"; //eert
        String printStr="";
        Map<Character, Integer> frqmap= new TreeMap<>();
        for(Character ch: str.toCharArray()){
            if(frqmap.containsKey(ch)){
                frqmap.put(ch, frqmap.get(ch)+1);
            }
            else {
                frqmap.put(ch, 1);
            }
        }

//System.out.println(frqmap);
        List<Map.Entry<Character, Integer>> list = frqmap.entrySet().stream().sorted(((o2, o1) -> o1.getValue() - o2.getValue())).collect(Collectors.toList());
       for (Map.Entry<Character,Integer> entry: list){

           for (int i=0;i<entry.getValue();i++){
               printStr+=entry.getKey();
           }

          //
       }
       System.out.println(printStr);




    }
}
