package com.core.string;

public class RevSubString {
    public static void main(String[] args) {
        String s1="Sunny";
        String s2="Saini";

        s1=s1+s2;

        s2=s1.substring(0,s1.length()-s2.length());
      s1=  s1.substring(s2.length());

        System.out.println("s1 "+s1);
        System.out.println("s2 "+s2);

    }
}
