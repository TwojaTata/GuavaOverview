package com.patrykkuchar.app;

public class PreconditionsExample {
    public static void main(String[] args) {

        System.out.println(new Person("Jack", null, true).toString());
        System.out.println(new Person("Greta", 50, true).toString());
        System.out.println(new Person("Vladimir", 45, null).toString());

//        System.out.println(new Person("Tom", -2).toString());
//        Person person2 = new Person("Tom", 10, false);
//        person2.walk();
    }
}
