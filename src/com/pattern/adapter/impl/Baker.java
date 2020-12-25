package com.pattern.adapter.impl;

public class Baker {
    private final Cake cake;

    public Baker(Cake cake) {
        this.cake = cake;
    }

    public void getCake() {
        cake.make();
    }
}
