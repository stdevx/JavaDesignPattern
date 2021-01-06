package com.pattern.visitor.impl;

public class SoldierVisitor implements UnitVisitor{
    @Override
    public void visitSoldier(Soldier soldier) {
        System.out.println("Greeting soldier");
    }

    @Override
    public void visitSergeant(Sergeant sergeant) {

    }

    @Override
    public void visitCommander(Commander commander) {

    }
}
