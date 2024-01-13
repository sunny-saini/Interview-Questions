package com.core.iris;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

import static java.lang.Double.*;
import static java.util.stream.Collectors.groupingBy;


public class Interview {
    static class Employee {

            public Employee(String empId, String empName, Double salary, String dept) {
                super();
                this.empId = empId;
                this.empName = empName;
                this.salary = salary;
                this.dept = dept;

            }
            public String empId;
            public String empName;
            public Double salary;
            public int age;
            public String dept;

        public String getEmpId() {
            return empId;
        }

        public void setEmpId(String empId) {
            this.empId = empId;
        }

        public String getEmpName() {
            return empName;
        }

        public void setEmpName(String empName) {
            this.empName = empName;
        }

        public Double getSalary() {
            return salary;
        }

        public void setSalary(Double salary) {
            this.salary = salary;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getDept() {
            return dept;
        }

        public void setDept(String dept) {
            this.dept = dept;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "empId='" + empId + '\'' +
                    ", empName='" + empName + '\'' +
                    ", salary=" + salary +
                    ", age=" + age +
                    ", dept='" + dept + '\'' +
                    '}';
        }
    }

        //TODO : Need to Implement by using Java 8 Streams
        public static void processEmployees(Map<String, Employee> empMap, String dept ){
            // Print the sum of salaries of all employees of given department

            Map<String, Double> collect = empMap.entrySet().stream().map(val -> val.getValue()).
                    collect(Collectors.groupingBy(Employee::getDept, Collectors.summingDouble(Employee::getSalary)));

           System.out.println(collect);


    }


        public static void main(String...strings){
            //Created 4 Employee Objects
            Employee e1 = new Employee("e1", "Amar", 1000.0, "HR");
            Employee e2 = new Employee("e2", "Akbar", 1050.0, "Admin");
            Employee e3 = new Employee("e3", "Anthony", 1100.0, "HR");
            Employee e4 = new Employee("e4", "Geeta", 1200.0, "Admin");

            //Populate employee Object in map.
            Map<String, Employee> empMap = new HashMap<String, Employee>();
            empMap.put("e1", e1);
            empMap.put("e2", e2);
            empMap.put("e3", e3);
            empMap.put("e4", e4);

            processEmployees(empMap, "Admin");

        }


    }



