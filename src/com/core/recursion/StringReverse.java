package com.core.recursion;

public class StringReverse {

    public static void main(String[] args) {
        String retu = new StringReverse().reverse("12345");
        System.out.println(retu);

        String str="sun";
        System.out.println(str.substring(1));
    }

    String reverse(String str){
        if(str.isEmpty())
            return str;

        return reverse(str.substring(1))+str.charAt(0);
    }
}
