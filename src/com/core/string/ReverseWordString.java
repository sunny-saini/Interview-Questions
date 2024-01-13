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




        String str1="";

       String [] str2= str.split(" ");

for (int i=str2.length-1; i>=0;i--){

str1+=str2[i]+ " ";



        }
System.out.println(str1);

    }
    }

