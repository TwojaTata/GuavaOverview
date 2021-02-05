package com.patrykkuchar.app;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;

class Person {

    private String name;
    private Integer age;
    private Boolean isAlive = true;

    Person(String name, Integer age, Boolean isAlive) {
        this.name = Preconditions.checkNotNull(name);
        this.age = age;
        this.isAlive = isAlive;
    }

    Person(String name, Integer age) {
//        Preconditions.checkArgument(age >= 0, "Age (%s) must not be a negative value", age); // IAE
        this.name = name;
        this.age = age;
    }

    void walk() {
//        Preconditions.checkState(this.isAlive, "Person must be alive to walk"); // ISE
        System.out.println("Walking...");
    }

    String getName() {
        return name;
    }

    Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("Name", name)
                .add("Age", age)
                .add("isAlive", isAlive)
                .omitNullValues()
                .toString();
    }
}
