package com.core.sort;

import java.util.*;

public class SortHashMapByValue {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Apple", 5);
        hashMap.put("Banana", 3);
        hashMap.put("Cherry", 8);
        hashMap.put("Grapes", 2);

        // Sort the entries of the HashMap by value
        List<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>(hashMap.entrySet());

        Collections.sort(sortedEntries, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> entry1, Map.Entry<String, Integer> entry2) {
                return entry1.getValue().compareTo(entry2.getValue());
            }
        });

        // Create a LinkedHashMap to preserve the sorted order
        LinkedHashMap<String, Integer> sortedHashMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : sortedEntries) {
            sortedHashMap.put(entry.getKey(), entry.getValue());
        }

        // Print the sorted HashMap
        for (Map.Entry<String, Integer> entry : sortedHashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
