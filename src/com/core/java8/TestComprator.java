package com.core.java8;

import java.util.*;
import java.util.stream.Collectors;

public class TestComprator {

    public static void main(String[] args) {
        EmpComprartor e1 = new EmpComprartor(1, "Sunni", 2000.98);
        EmpComprartor e2 = new EmpComprartor(2, "Saini", 200220.98);
        EmpComprartor e3 = new EmpComprartor(4, "Kumar", 12000.98);

        List<EmpComprartor> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);


        Collections.sort(list,new NameComprator());
        System.out.println(list);
        System.out.println("======================");

        List<EmpComprartor> emp = list.stream().sorted((o1, o2) -> o1.getName().compareTo(o2.getName())).collect(Collectors.toList());
        List<EmpComprartor> emp1 = list.stream().sorted(Comparator.comparing(EmpComprartor::getSalary).reversed()).collect(Collectors.toList());

        System.out.println(emp1);
    }
}
