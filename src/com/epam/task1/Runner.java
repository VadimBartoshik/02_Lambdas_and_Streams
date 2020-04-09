package com.epam.task1;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        PersonList personList = new PersonList(new ArrayList<>());

        Person vadim = new Person("Vadim", 17);
        Person vlad = new Person("Vlad", 20);
        Person nikita = new Person("Nikita", 19);
        Person irina = new Person("Irina", 21);
        Person dasha = new Person("Dasha", 18);

        System.out.println("List of person:");

        personList.getPersonList().add(vadim);
        personList.getPersonList().add(vlad);
        personList.getPersonList().add(nikita);
        personList.getPersonList().add(irina);
        personList.getPersonList().add(dasha);

        personList.printPerson();

        System.out.println("*************");

        System.out.println("List sorted by Name");
        personList.setPersonList(personList.sortedByName());
        personList.printPerson();
        System.out.println("*************");

        System.out.println("List sorted by Age");
        personList.setPersonList(personList.sortedByAge());
        personList.printPerson();

    }
}
