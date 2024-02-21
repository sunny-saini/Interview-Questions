package com.core.searching;

public class SortedMatrixBinarySearch {

    public static boolean searchInSortedMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        int low = 0;
        int high = rows * cols - 1; // Treat the 2D matrix as a 1D array

        while (low <= high) {
            int mid = (low + high) / 2;
            int midValue = matrix[mid / cols][mid % cols];

            if (midValue == target) {
                return true; // Element found
            } else if (midValue < target) {
                low = mid + 1; // Search in the right half
            } else {
                high = mid - 1; // Search in the left half
            }
        }

        return false; // Element not found
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
