package com.core.roughWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class IamdaExpo {
    public static void main(String[] args) {
        List<Integer> li= Arrays.asList(1,2,3,4,5);
         String product = "Java";
        Consumer t= ( num)->{
            System.out.println(num);
        };

        li.stream().forEach(t);

        Predicate<Integer> p= el->{
            return el % 2 == 0;
        };

        List<Integer> ans = li.stream().filter(p).collect(Collectors.toList());
        System.out.println(ans);

        Function<Integer,Long> f=(l1)->{
           return l1*2L;
        };

   List<Long>   mp=  li.stream().map(f).collect(Collectors.toList());
        System.out.println(mp);


        Supplier<Boolean> boolSupplier = () -> product.length() == 10;

        System.out.println(boolSupplier.get());
    }
}
