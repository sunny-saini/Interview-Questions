package com.core.Mphasis;


     /* A robot can move in 4 directions up, down, left and right.
     It's path is encoded in a string with characters U, D, L and R.
      If the bot starts at coordinate { 0,0} then find it's final coordinate based on the input path string .


        Input : UDRR

        Output : [2,0]

        Input : DD

        Output : [0,-2] */


import java.util.Arrays;

public class Problem2 {
    public static void main(String[] args) {

        String input="UDRR";
        int upmoveCount=0;
        int downmoveCount=0;
        int leftmoveCount=0;
        int  rightmoveCount=0;
        int cooridation[]=new int[2];

        for(int i=0;i<input.length();i++){
            if(input.charAt(i)=='U'){
                //cooridation[0]=0;
                cooridation[0]++;
            }
            else if(input.charAt(i)=='D'){
             //   cooridation[0]=0;
                cooridation[0]--;
            }
            else if(input.charAt(i)=='R'){
              //cooridation[0]=1;
              cooridation[1]++;
            }
            else {
              //  cooridation[0]=0;
                cooridation[1]--;
            }
        }

System.out.println(Arrays.toString(cooridation));


    }
}
