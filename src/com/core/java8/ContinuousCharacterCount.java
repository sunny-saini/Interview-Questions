package com.core.java8;

import java.util.stream.Stream;

public class ContinuousCharacterCount {
    public static void main(String[] args) {
        String input = "aaabbbccdddeeeff";
        char targetChar = 'a'; // Character to count continuously

        // Convert the input string to a stream of characters
        Stream<Character> charStream = input.chars().mapToObj(c -> (char) c);

        // Use the Stream API to count continuous occurrences of the target character
        int count = charStream.reduce(
                new CountAndChar(0, '\0'),
                (acc, c) -> {
                    if (c == targetChar) {
                        if (c == acc.lastChar) {
                            return new CountAndChar(acc.count + 1, c);
                        } else {
                            return new CountAndChar(1, c);
                        }
                    } else {
                        return new CountAndChar(0, c);
                    }
                },
                (acc1, acc2) -> {
                    if (acc1.count > acc2.count) {
                        return acc1;
                    } else {
                        return acc2;
                    }
                })
                .count;

        System.out.println("Longest continuous '" + targetChar + "' sequence: " + count);
    }
}

class CountAndChar {
    int count;
    char lastChar;

    CountAndChar(int count, char lastChar) {
        this.count = count;
        this.lastChar = lastChar;
    }
}
