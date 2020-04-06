package com.epam.task1;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PersonList implements Comparator {
    private List<Person> personList;

    public PersonList(List<Person> personList) {
        this.personList = personList;
    }

    public void addPerson(Person person) {
        if (findPerson(person) == null) {
            personList.add(person);
        }
    }

    public void removePerson(Person person) {
        if (findPerson(person) != null) {
            personList.remove(person);
        }
    }

    public void printPerson() {
        for (Person person : personList) {
            System.out.println(person.getName() + " " + person.getAge());
        }
    }

    public Person findPerson(Person person) {
        for (Person p : personList) {
            if (p.equals(person)) {
                return person;
            }
        }
        return null;
    }


    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }


    public List<Person> sortedByName() {
        List<Person> byName = personList.stream().sorted((o1, o2) -> -o2.getName().compareTo(o1.getName())).
                collect(Collectors.toList());
        return byName;
    }

    public List<Person> sortedByAge() {
        List<Person> byAge = personList.stream().sorted((o1, o2) ->
                o1.getAge().compareTo(o2.getAge())).collect(Collectors.toList());
        return byAge;
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}
