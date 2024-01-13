package com.core.array;

public class EquilibriumIndex {
    public static void main(String[] args) {
                      //0, 1  2  3   4  5  6
        int[] array = {-7, 1, 5, 2, -4, 3, 0};
        int equilibriumIndex = findEquilibriumIndex(array);

        if (equilibriumIndex != -1) {
            System.out.println("Equilibrium index: " + equilibriumIndex);
        } else {
            System.out.println("No equilibrium index found.");
        }
    }

    static int findEquilibriumIndex(int[] array) {
        int totalSum = 0;
        int leftSum = 0;
        
        // Calculate total sum of the array
        for (int num : array) {
            totalSum += num;
        }
        
        // Iterate through the array to find equilibrium index
        for (int i = 0; i < array.length; i++) {
            totalSum -= array[i]; // Subtract the current element from the total sum
            if (leftSum == totalSum) {
                return i; // Equilibrium index found
            }
            leftSum += array[i]; // Add the current element to the left sum
        }
        
        return -1; // No equilibrium index found
    }
}
