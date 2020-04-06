package com.epam.task1;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private int age;
    private ArrayList<Person> personList;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
