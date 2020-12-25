package com.pattern.observer.impl;

public enum LightColor {

    RED(0, "红灯"), YELLOW(1, "黄灯"), GREEN(2, "绿灯");

    private final int index;
    private final String value;

    LightColor(int index, String value) {
        this.index = index;
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "下标：" + index + " 值：" + value;
    }

}
