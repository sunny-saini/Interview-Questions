package com.core.roughWork;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Fiboncci {
    public static void main(String[] args) {
      //  System.out.println(Arrays.toString(new List[]{fibonacci(6)}));
        System.out.println(isAnagramCounting("sunny","synni"));
    }


    public static List< Integer > fibonacci(int limit) {

        return Stream.iterate(new int[] {0, 1}, t -> new int[] {t[1], t[0] + t[1]}).limit(limit).map(n -> n[0])
                .collect(Collectors.toList());
    }

    public static List< Integer > fibonaccri(int limit) {
        return Stream.iterate(new int[]{0,1},t->new int[]{t[0],t[0]+t[1]}).limit(limit).map(n->n[0]).collect(Collectors.toList());
    }

    private static int CHARACTER_RANGE= 256;

    public static boolean isAnagramCounting(String string1, String string2) {
        if (string1.length() != string2.length()) {
            return false;
        }
        int count[] = new int[CHARACTER_RANGE];
        for (int i = 0; i < string1.length(); i++) {
            count[string1.charAt(i)]++;
            count[string2.charAt(i)]--;
        }
        for (int i = 0; i < CHARACTER_RANGE; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;
    }

}
