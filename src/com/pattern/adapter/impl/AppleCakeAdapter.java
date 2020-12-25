package com.pattern.adapter.impl;

public class AppleCakeAdapter implements Cake {

    private final AppleCake appleCake;

    @Override
    public void make() {
        appleCake.getAppleCake();
    }

    public AppleCakeAdapter() {
        appleCake = new AppleCake();
    }
}
