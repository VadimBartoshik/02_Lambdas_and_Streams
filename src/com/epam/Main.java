package com.epam;

import com.epam.task1.Person;
import com.epam.task1.PersonList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        PersonList personList = new PersonList(new ArrayList<>());

        Person vadim = new Person("Vadim", 17);
        Person vlad = new Person("Vlad", 20);
        Person irina = new Person("Irina", 19);
        Person nikita = new Person("Nikita", 18);
        Person dasha = new Person("Dasha", 21);

        personList.getPersonList().add(vadim);
        personList.getPersonList().add(dasha);
        personList.getPersonList().add(vlad);
        personList.getPersonList().add(irina);
        personList.getPersonList().add(nikita);

        System.out.println("List of person:");
        personList.printPerson();
        System.out.println("****************");
        personList.setPersonList(personList.sortedByName());
        System.out.println("List sorted by Name");
        personList.printPerson();
        System.out.println("****************");
        personList.setPersonList(personList.sortedByAge());
        System.out.println("List sorted by Age");
        personList.printPerson();
    }
}
