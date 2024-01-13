package com.core.array;

public class MatrixSum {
    public static void main(String[] args) {
        int n=3,m=4;
        int [][]mat =new int[n][m];

      mat= new int[][]{{3, 8, 9, 2},
                       {1, 2, 3, 6},
                       {4, 10, 11, 17}};

 maxColumnSum(mat);

      int sum;
      int maxsum=0;
      for (int i=0;i<mat.length;i++){
          sum=0;
          for (int j=0;j< mat[0].length;j++){
              sum=sum+mat[i][j];

               maxsum =(int) Math.max(sum, sum);
          }

      }
        System.out.println(maxsum);
    }

    private static void maxColumnSum(int[][] mat) {

        int maxsum=0;

        for(int j=0;j<mat[0].length;j++){
            int sum=0;
            for (int i=0;i<mat.length;i++){

                sum=sum+mat[i][j];
                 maxsum = Math.max(sum, sum);

            }
            System.out.println("sum of Column: " +sum );
            System.out.println("MAxsum of Column: " +maxsum );
        }

    }
}
