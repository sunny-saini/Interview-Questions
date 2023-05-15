package com.core.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertListToMap {
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

        Map<Integer, String> mp = e.stream().collect(Collectors.toMap(Employee::getId, Employee::getName));
    }
}
