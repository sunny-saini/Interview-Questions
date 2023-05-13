package com.core.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Implementation {
    public static void main(String[] args) {
     Employee e1=  new Employee(1,"Sunny","Roorkee");
        Employee e2=  new Employee(2,"Jony","Bhagwanpur");
        Employee e3=  new Employee(3,"Ramesh","Haridwar");
        Employee e4=  new Employee(4,"Ishawer","Kishanpur");


        List<Employee> e= new ArrayList<>();
        e.add(e1);
        e.add(e2);
        e.add(e3);
        e.add(e4);

List<Employee> result=e.stream().map(mp-> {

    if(mp.getAddress().equals("Roorkee")){
        mp.setAddress("UK");
    }

    return mp;
}).collect(Collectors.toList());

System.out.println(result);

    }
}
