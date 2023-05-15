package com.core.java8;

import java.util.Comparator;

public class NameComprator implements Comparator<EmpComprartor> {
    @Override
    public int compare(EmpComprartor o1, EmpComprartor o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
