package com.core.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortString {
    public static void main(String[] args) {
        List<String> list= new ArrayList<>(Arrays.asList("This ","is", "Scam"));

        List<String> ans = list.stream().map(str->str.toLowerCase()).sorted().collect(Collectors.toList());

    System.out.println(ans);
    }
}
