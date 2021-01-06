package com.pattern.visitor.impl;

public class Sergeant extends Unit{
    public Sergeant(Unit... people) {
        super(people);
    }

    @Override
    public void accept(UnitVisitor visitor) {
        visitor.visitSergeant(this);
        super.accept(visitor);
    }

    @Override
    public String toString() {
        return "Sergeant";
    }
}
