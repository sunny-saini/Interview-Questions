package com.core.java8;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ContinuousCharactersExample {
    public static void main(String[] args) {




        String str = "aabbbccddbb";
        Stream<String> result = Arrays.stream(str.split("(?<=(.))(?!\\1)"))
                .map(s -> (s.length() > 1 ? s.length() : "")
                        + Character.toString(s.charAt(0)));
        System.out.println(result.collect(Collectors.toList()));






   //     String inputString = "Hello123World";
        
        // Convert the string to a stream of characters
    //    inputString.chars()
            // Filter out non-alphabetic characters
       //     .filter(Character::isLetter)
            // Convert characters back to a string
       //     .forEach(ch -> System.out.print((char) ch));
        
        // Alternatively, collect the characters into a string
      //  String result = inputString.chars()
       //     .filter(Character::isLetter)
        //    .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
         //   .toString();
        
    //    System.out.println("\nResult: " + result);
    }
}
