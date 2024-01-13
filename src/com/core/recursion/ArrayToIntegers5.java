package com.core.recursion;

import java.util.Arrays;

public class ArrayToIntegers5 {

 public static void main(String[] args) {
  int intArrs[] = { 2, 0, 1, 9 };

 /* System.out.print("int arrays: [");
  for (int i = 0; i < intArrs.length; i++) {
   System.out.print(intArrs[i]);
   if (i < intArrs.length - 1) {
    System.out.print(",");
   }
  }
  System.out.print("]");
*/
  System.out.print(" -> converted: ");
  System.out.println(Arrays.toString(intArrs).replaceAll("\\D+",""));
 }
}