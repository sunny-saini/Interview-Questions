package com.core.backtracking;

public class RatMaze {
    public static void main(String[] args) {
        int maze[][] = { { 1, 1, 2, 0 },
                         { 1, 1, 2, 1 },
                         { 2, 1, 2, 1 },
                         { 1, 1, 2, 2 } };


       Boolean returnValue=check(maze,0,0);
       System.out.println(returnValue);
    }

    static boolean check(int A[][],int i, int j){

      int M= A.length;
        if(i==M-1 && j==M-1)
            return  true;

        if(i<0 || i>M-1 ||
           j<0 || j>M-1)
            return false;
        if(A[i][j]==1 && A[i][j]==2)
            return false;
        A[i][j]=2;
        return check(A,i+1,j) ||
                check(A,i,j+1) ||
                check(A,i-1,j) ||
                check(A,i,j-1);
    }
}
