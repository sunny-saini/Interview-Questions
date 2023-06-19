package com.core.string;

import java.util.ArrayList;
import java.util.List;

public class ReturnMissing {
    public static void main(String[] args) {
        List<Character> result = returnList("AN");
        System.out.println(result);
    }

    static List<Character> returnList(String str) {

        List<Character> listCh = new ArrayList<>();
        boolean ar[] = new boolean[26];

        for (int i = 0; i < str.length(); i++) {
            if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
                ar[str.charAt(i) - 'A'] = true;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (ar[i] == false) {
                listCh.add((char) (i+'A'));
            }
        }
        return listCh;
    }
}

