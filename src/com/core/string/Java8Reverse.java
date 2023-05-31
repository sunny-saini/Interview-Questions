package com.core.string;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Java8Reverse {
    public static void main(String[] args) {
        String str = "this is fan";

        String str3 = Arrays.asList(str.split(" ")).stream().
                map(mp -> new StringBuilder(mp).reverse()).collect(Collectors.joining(" "));

       String re= new Java8Reverse().reverseWordss("Sunny Saini is a boy         ");

System.out.println(re);
    }




        public String reverseWordss(String s) {
                if (s == null || s.length() == 0)
                {
                    return "";
                }
                // split to words by space
                String[] arr = s.split(" ");
                StringBuilder sb = new StringBuilder();
                for (int i = arr.length - 1; i >= 0; --i)
                {

                        sb.append(arr[i]).append(" ");

                }
                return sb.length() == 0 ? "" : sb.substring(0, sb.length() - 1);

    }





}
