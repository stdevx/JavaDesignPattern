package com.pattern.visitor.impl;

public class Soldier extends Unit {

    public Soldier(Unit... people) {
        super(people);
    }

    @Override
    public void accept(UnitVisitor visitor) {
        visitor.visitSoldier(this);
        super.accept(visitor);
    }

    @Override
    public String toString() {
        return "Soldier";
    }

}
