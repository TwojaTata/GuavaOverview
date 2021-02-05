package com.patrykkuchar.app;

import com.google.common.collect.Ordering;

import java.util.Arrays;
import java.util.List;

public class OrderingExample {

    public static void main(String[] args) {
        sortPersons();
    }

    private static void sortPersons() {

        List<Person> persons = Arrays.asList(
                new Person(null, 55),
                new Person("Wojtek", 55),
                new Person("Tomek", 30),
                new Person("Jacek", 30),
                new Person("Bartek", null),
                new Person("Kasia", 27));

        Ordering<Person> ordering = Ordering
                .natural()
                .nullsFirst()
                .onResultOf(Person::getAge)
                .compound(Ordering
                        .natural()
                        .nullsFirst()
                        .onResultOf(Person::getName));

        persons.sort(ordering);
        System.out.println(persons.toString());
    }
}
