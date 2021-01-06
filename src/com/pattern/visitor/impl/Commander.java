package com.pattern.visitor.impl;

public class Commander extends Unit{

    public Commander(Unit... people) {
        super(people);
    }

    @Override
    public void accept(UnitVisitor visitor) {
        visitor.visitCommander(this);
        super.accept(visitor);
    }

    @Override
    public String toString() {
        return "Commander";
    }

}
