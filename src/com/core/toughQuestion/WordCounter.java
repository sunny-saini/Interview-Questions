package com.core.toughQuestion;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    public static void main(String[] args) {


        String word = "Sunny Saini is software developer";

        String arr[] = word.split(" ");
        Map<String, Integer> map = new HashMap();
        for (String val : arr) {

            if (map.containsKey(val)) {

                map.put(val, map.get(val) + 1);

            } else {
                map.put(val, 1);
            }

        }
        System.out.println(map);

    }

}



