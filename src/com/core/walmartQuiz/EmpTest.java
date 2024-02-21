package com.core.walmartQuiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmpTest {
    public static void main(String[] args) {
        List<Employee> empList= new ArrayList<>();
        Employee l1 = new Employee("Sunny", 5000);
        Employee l2 = new Employee("Visal", 51000);
        Employee l3 = new Employee("Moti", 15000);
        Employee l4 = new Employee("Bikah", 5000);
        Employee l5 = new Employee("Sanju", 5000);
        empList.add(l1);
        empList.add(l2);
        empList.add(l3);
        empList.add(l4);
        empList.add(l5);

        Map<Integer, List<Employee>> data = empList.stream().collect(Collectors.groupingBy(Employee::getSalary));
        System.out.println(data);


   

    }
}
