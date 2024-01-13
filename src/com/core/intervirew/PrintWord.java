package com.core.intervirew;

import java.util.Scanner;

public class PrintWord {
    public static void main(String[] args) {
        String [] singleDigit=new String[]{"zero","one","two","three","four","five","six","seven","eight","nine"};
        String[] two_digits = new String[] {"", "ten", "eleven","twelve","thirteen",  "fourteen", "fifteen", "sixteen",
                "seventeen", "eighteen", "nineteen"};
        String[] tensPlace = new String[] {"","","twenty","thirty","forty",
                "fifty", "sixty","seventy", "eighty", "ninety"};
        String[] tensPower = new String[] { "hundred", "thousand" };

        Scanner sc= new Scanner(System.in);
        String num = sc.next();
      char[]  ch= num.toCharArray();
      int in;
        if(ch.length==1){
             in = ch[0] - '0';
            System.out.println(singleDigit[in]);
        }
        if(ch.length==2 && ch[0]=='1'){
         in= (ch[0]-'0') + (ch[1]-'0');
        System.out.println(two_digits[in]);
        }
        else if (ch.length==2 && ch[1]==48) {
             in= (ch[0]-'0') + (ch[1]-'0');
            System.out.println(tensPlace[in]);
        }
        else if(ch.length==2){
            in=(ch[0]-'0');
            System.out.print(tensPlace[in]);
            in=(ch[1]-'0');
            System.out.print(singleDigit[in]);
        }
      //  else if (ch.length==3) {
        //    in= ch[0]-'0';
        //    System.out.print(singleDigit[in]);
       //     System.out.print(tensPower[0]);


    //    }

        else if (ch.length==3 && ch[2]!=48) {
            in= ch[0]-'0';
            System.out.print(singleDigit[in]);
            System.out.print(tensPower[0]);
           int c= (ch[1]-'0') + (ch[2]-'0');
            System.out.print(two_digits[c]);

        }
    }
}
