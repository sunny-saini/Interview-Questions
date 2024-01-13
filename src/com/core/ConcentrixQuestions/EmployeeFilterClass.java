package com.core.ConcentrixQuestions;

import com.core.ConcentrixQuestions.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeFilterClass {
    public static void main(String[] args) {
        List<Employee> list= new ArrayList<>();
        list.add(new Employee(1,"Sunny",67));
        list.add(new Employee(2,"Mukesh",34));
       list.add(new Employee(3,"Suresh",37));


        long result = list.stream().filter(employee -> employee.getAge() > 50).count();
        System.out.println(result);


        Map<Integer, String> map = list.stream().collect(Collectors.toMap(Employee::getId, Employee::getName));
       
    }
}
