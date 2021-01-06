package com.pattern.visitor;

import com.pattern.visitor.impl.*;

public class VisitorExample {
    public void show() {
        Commander commander = new Commander(
                new Sergeant(new Soldier(), new Soldier(), new Soldier()),
                new Sergeant(new Soldier(), new Soldier(), new Soldier())
        );
        commander.accept(new SoldierVisitor());
        commander.accept(new SergeantVisitor());
        commander.accept(new CommanderVisitor());
    }
}
