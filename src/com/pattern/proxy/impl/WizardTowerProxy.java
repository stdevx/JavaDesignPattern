package com.pattern.proxy.impl;

public class WizardTowerProxy implements WizardTower{


    private static final int NUM_ALLOWED = 3;
    private int numOfWizard;

    private final WizardTower wizardTower;

    @Override
    public void enter(Wizard wizard) {
        if (numOfWizard < NUM_ALLOWED) {
            wizardTower.enter(wizard);
            numOfWizard += 1;
        } else {
            System.out.println(wizard + " is not allowed to enter!");
        }
    }

    public WizardTowerProxy(WizardTower wizardTower) {
        this.wizardTower = wizardTower;
    }
}
