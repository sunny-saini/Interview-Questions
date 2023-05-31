package com.core.toughQuestion;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrintPrime {
    public static void main(String[] args) {
        boolean result = new PrintPrime().findPrime(13);
        System.out.println(result);

       new PrintPrime().printPrime(20);
    }


   void printPrime(int n){
      List<Integer> s = IntStream.rangeClosed(2, n).boxed().collect(Collectors.toList());
       List<Integer> as = s.stream().filter(fil -> findPrime(fil)).collect(Collectors.toList());

       System.out.println(as);


    }

    static boolean findPrime(int num){
        return num>=2 && IntStream.range(2,num).noneMatch(h->num%h==0);
    }

}
