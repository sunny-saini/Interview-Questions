package com.core.hclquestion;

public class ArmStrongNum {
    public static void main(String[] args) { //3**3 + 7**3 + 1**3 = 371.
        int c=1;
                int a=c;
        int sum=0;
        while (a>0){
           int modulos= a%10;

           sum= (int) (sum+(modulos*modulos*modulos));
            a=a/10;
        }
        if(c==sum)
        System.out.println("Yes ArmStrong");
        else
        System.out.println("No ArmStrong");

    }
}
