package com.core.array;

import java.util.Scanner;


public class Main {

public static void main(String[] args) {

Scanner sc = new Scanner(System. in);

int N = sc. nextInt();

int arr[] = new int[N];


for (int i = 0; i < N; i++) {

arr[i] = sc. nextInt();

}


int B = sc. nextInt();

B = B % N; // To handle cases where B > N


// Reverse the entire array

reverse(arr, 0, N - 1);


// Reverse the first B elements

reverse(arr, 0, B - 1);


// Reverse the remaining elements after rotating B times

reverse(arr, B, N - 1);


// Print the rotated array

for (int i = 0; i < N; i++) {

System. out. print(arr[i] + " ");

}

}


private static void reverse(int[] arr, int s, int e) {

int i = s;

int j = e;

while (i < j) {

swap(i, j, arr);

i++;

j--;

}

}


private static void swap(int s, int e, int arr[]) {

final int temp = arr[s];

arr[s] = arr[e];

arr[e] = temp;

}

}

