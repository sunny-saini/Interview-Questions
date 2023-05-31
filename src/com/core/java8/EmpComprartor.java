package com.core.java8;

import java.util.Comparator;

public class EmpComprartor  {

    private  int id;
    private String name;

    private Double salary;


    private String dept;

    public EmpComprartor(int id, String name, Double salary,String dept) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.dept=dept;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }


    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "EmpComprartor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", dept='" + dept + '\'' +
                '}';
    }
}
