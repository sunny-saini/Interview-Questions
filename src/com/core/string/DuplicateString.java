package com.core.string;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateString {
    public static void main(String[] args) {
        String str="This is a String is a";

        String[] str1 = str.split(" ");

        Set<String> strings= new HashSet<>();

        for (int i=0;i< str1.length;i++){
            if(strings.contains(str1[i])){
                System.out.println(str1[i]);
            }
            else {
                strings.add(str1[i]);
            }
        }

        List<String> listString = Arrays.asList(str1);

        Map<String, Long> result = listString.stream().collect(Collectors.groupingBy(i -> i, LinkedHashMap::new ,Collectors.counting()));

        for(Map.Entry<String,Long> entry: result.entrySet()){
            if(entry.getValue()>1)
            System.out.println();
        }

       // System.out.println(result);
    }
}
