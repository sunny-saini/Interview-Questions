package com.core.sort;

import java.util.*;

public class SortHashMapByKeyExample {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(4, "Apple");
        hashMap.put(2, "Banana");
        hashMap.put(1, "Orange");
        hashMap.put(3, "Grapes");

        // Create a TreeMap and pass the HashMap to its constructor
        TreeMap<Integer, String> sortedMap = new TreeMap<>(hashMap);

        // Iterate through the TreeMap to get entries in sorted order by key
        for (Map.Entry<Integer, String> entry : sortedMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
