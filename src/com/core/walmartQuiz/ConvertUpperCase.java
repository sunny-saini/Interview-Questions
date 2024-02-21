package com.core.walmartQuiz;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



public class ConvertUpperCase {
    public static void main(String[] args) {
        List<String> l = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.","Canada");

                List<String> updatedlist = l.stream().map( e -> e.toUpperCase()).collect(Collectors.toList());

              //  System.out.println(updatedlist);

                l.replaceAll(String::toUpperCase);
        System.out.println(l);

    }
}
