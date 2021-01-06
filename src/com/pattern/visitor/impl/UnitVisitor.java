package com.pattern.visitor.impl;

public interface UnitVisitor {

    void visitSoldier(Soldier soldier);

    void visitSergeant(Sergeant sergeant);

    void visitCommander(Commander commander);

}
