package com.core.java8;

import java.util.*;

public class LambdaMethodReferenceTest {
   public static void main(String args[]) {
      List<String> myList = Arrays.asList("INDIA", "AUSTRALIA", "ENGLAND", "NEWZEALAND", "SCOTLAND");
      System.out.println("------- Lambda Expression --------");

      // Using Lambda function to call system.out.println()
      myList.stream().map(s -> s.toLowerCase())
                     .forEach(s -> System.out.println(s));

      System.out.println("------- Method Reference ---------");

      // Using Method reference to call system.out.println()
      myList.stream().map(String :: toUpperCase).sorted()
                     .forEach(System.out :: println);
   }
}