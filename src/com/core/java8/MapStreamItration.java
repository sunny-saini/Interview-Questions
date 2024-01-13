package com.core.java8;

import java.util.HashMap;
import java.util.Map;

public class MapStreamItration {
    public static void main(String[] args) {
        Map<String,String> mp= new HashMap<>();
        mp.put("Sunny","Saini");
        mp.entrySet().stream().forEach(k-> System.out.println(k.getKey()+" "+k.getValue()));


    }
}
