package com.core.java8;

public class LamdaExpressionImpl {
    public static void main(String[] args) {
        LamdaExp ex = (a,i) -> {
            return "hello";

        };
        ex.say(7,"Sunny");
    }
}