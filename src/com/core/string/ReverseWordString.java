package com.core.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseWordString {
    public static void main(String[] args) {
        String str=" This is an ant";


      /*  List<String> listStr= new ArrayList<>(Arrays.asList(str.split(" ")));
        List<String> list= new ArrayList<>();


        for(int i= listStr.size()-1;i>=0;i--){

            list.add(listStr.get(i));


        }

        System.out.println(list.toString().replaceAll(","," "));
*/






        String str1 ="";

        for(int i=str.length()-1; i>=0;i--){
            str1+=str.charAt(i);
        }

       String [] str2= str1.split(" ");

for (int i=0;i<str2.length;i++){

    String temp = str2[i];
    String  s="";
    for(int k=temp.length()-1;k>=0;k--){

       s+= temp.charAt(k);

    }
    System.out.print(" "+s);



        }

    }
    }

