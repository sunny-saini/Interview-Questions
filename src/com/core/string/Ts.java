package com.core.string;

public class Ts
{
    public static void main(String[] args) {
        int meal = 5;
        int tip = 2;
        int total = meal + (meal>6 ? tip++ : tip--);
        System.out.print(total);//6
    }
}
