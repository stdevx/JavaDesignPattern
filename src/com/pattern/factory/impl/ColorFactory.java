package com.pattern.factory.impl;

public class ColorFactory {

    public static Color getColor(ColorType colorType) {
        return colorType.getConstructor().get();
    }

}
