package com.pattern.factory.impl;

import java.util.function.Supplier;

public enum  ColorType {

    RED(Red::new),
    BLUE(Blue::new);

    private final Supplier<Color> constructor;

    ColorType(Supplier<Color> constructor) {
        this.constructor = constructor;
    }

    public Supplier<Color> getConstructor() {
        return this.constructor;
    }

}
