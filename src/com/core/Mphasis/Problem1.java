package com.core.Mphasis;

import java.util.*;
import java.util.stream.Collectors;

public class Problem1 {

    /*There are some IP addresses like 10.0.0.1,10.0.0.2 etc. We need to find out which IP address is the most visited

    INPUT: [ "10.0.0.1 satish","10.0.0.2 Vinay","10.0.0.1 Deepa"] ;

    O/P: "10.0.0.1"

   INPUT: { "10.0.0.1 satish","10.0.0.2 Vinay","10.0.0.1 satish"} ;

    O/P: "10.0.0.1"*/

    public static void main(String[] args) {
        //String str= "10.0.0.1 satish " +" 10.0.0.2 Vinay " +" 10.0.0.1 Deepa"; // String

      List<String> inputStr= Arrays.asList("10.0.0.1 satish","10.0.0.2 Vinay","10.0.0.1 Deepa");

   int count=1;
   int mostVisited=0;
List<String> li=new ArrayList<>();
   Map<String ,Integer > mp= new HashMap<>();

       for (int i=0;i<inputStr.size();i++){
           String[] split = inputStr.get(i).split(" ");
           li.add(split[0]);


        }

System.out.println(li);
       int  occerence=1;
       for(int i=0;i<li.size();i++){
           if(mp.containsKey(li.get(i))){

               mp.put(li.get(i),++occerence);
           }
           else {
               mp.put(li.get(i),1);
           }
       }
System.out.println(mp);
    }






}
