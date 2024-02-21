package com.core.searching;

public class SortedMatrixSearch {

    public static boolean searchInSortedMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        int row = 0;
        int col = cols - 1; // Start from the top-right corner

        while (row < rows && col >= 0) {
            if (matrix[row][col] == target) {
                return true; // Found the target
            } else if (matrix[row][col] < target) {
                // If the current element is less than the target, move to the next row
                row++;
            } else {
                // If the current element is greater than the target, move to the previous column
                col--;
            }
        }

        return false; // Target not found
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 4, 7, 14},
            {2, 5, 8, 16},
            {6, 12, 13, 23}
        };

        int target = 13;
        boolean found = searchInSortedMatrix(matrix, target);

        if (found) {
            System.out.println("Element " + target + " found in the matrix.");
        } else {
            System.out.println("Element " + target + " not found in the matrix.");
        }
    }
}
