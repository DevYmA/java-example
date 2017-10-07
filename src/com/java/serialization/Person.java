package com.java.serialization;

import java.io.Serializable;

public class Person implements Serializable{

    private static int id;
    private String name;
    transient private int salary;// not serialized to stream

    @Override
    public String toString() {
        return "Person{" +
                "name=" + name +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
