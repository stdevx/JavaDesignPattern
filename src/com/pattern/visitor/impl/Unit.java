package com.pattern.visitor.impl;

import java.util.Arrays;

public abstract class Unit {

    private final Unit[] people;

    public Unit(Unit... people) {
        this.people = people;
    }

    public void accept(UnitVisitor visitor) {
        Arrays.stream(people).forEach(person -> person.accept(visitor));
    }

}
