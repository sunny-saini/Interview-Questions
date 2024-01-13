package com.core.string;

import java.util.regex.Pattern;

public class RemoveCapitalLetterFromString {
    public static void main(String[] args) {
        String str="SunnY";
        str=str+str;
        String regex="[A-Z]";

        Pattern pattern = Pattern.compile(regex);
      str=  pattern.matcher(str).replaceAll("");

      if(str.charAt(2)=='n'){
         str= str.replace(str.charAt(2),'#');
      }
        System.out.println(str);
    }

    public String solve(String A) {
        A=A+A;
        String regex="[A-Z]";

        Pattern pattern = Pattern.compile(regex);
        A= pattern.matcher(A).replaceAll("");



        for(int i=0;i<A.length();i++){
            if(A.charAt(i)=='a'){
                A=  A.replace(A.charAt(i), '#');
            }
            else if(A.charAt(i)=='e'){
                A=  A.replace(A.charAt(i), '#');
            }
            else if(A.charAt(i)=='i'){
                A=  A.replace(A.charAt(i), '#');
            }
            else if(A.charAt(i)=='o'){
                A=  A.replace(A.charAt(i), '#');
            }
            else if(A.charAt(i)=='u'){
                A=  A.replace(A.charAt(i), '#');
            }
        }

        return A;
    }
}
