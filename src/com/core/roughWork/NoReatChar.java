package com.core.roughWork;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class NoReatChar {
    public static void main(String[] args) {
        String str="abdbaz";


        Map<Character,Integer> map= new LinkedHashMap<>();

        for(Character ch: str.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else {
                map.put(ch,1);
            }
        }
        Character nonRepat = null;
        for (Character ch: map.keySet()){
            if(map.get(ch)==1){
                nonRepat=ch;
                break;
            }
        }




      /*  Character a = str.chars().mapToObj(i -> (char) i).collect(Collectors.groupingBy(i -> i, LinkedHashMap::new, Collectors.counting())).entrySet()
                .stream().filter(val -> val.getValue() == 1).map(ky -> ky.getKey()).findFirst().get();

        LinkedHashMap<Character, Long> ans = str.chars().mapToObj(i -> (char) i).collect(Collectors.groupingBy(i -> i, LinkedHashMap::new, Collectors.counting()));*/

        System.out.println(nonRepat);
    }
}
