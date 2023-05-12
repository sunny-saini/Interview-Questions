package com.core;

public class StringBasic {
    public static void main(String[] args) {
        System.out.println(3+7+" "+8+6);
        System.out.println(2 + 2 + " .");
        System.out.println(" ." + 2 + 2);


        String s1="sunny";
        String s2=new String("sunny");

        System.out.println(s1==s2.intern());


        String str = "Hello world";
        String str2 = "Hello world";

        System.out.println(str == str2); // This prints false
        System.out.println(str.equals(str2)); // This prints true



        String s11 = new String("Hello");
        String s21 = new String("Hellow");
        System.out.println(s11 = s21);

    }
}
