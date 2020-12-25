package com.pattern.factory;

import com.pattern.factory.impl.Color;
import com.pattern.factory.impl.ColorFactory;
import com.pattern.factory.impl.ColorType;

public class FactoryExample {

    public void show() {
        System.out.println("工厂例子 开始");

        Color red = ColorFactory.getColor(ColorType.RED);
        System.out.println("Color red: " + red.getName());
        Color blue = ColorFactory.getColor(ColorType.BLUE);
        System.out.println("Color blue: " + blue.getName());

        System.out.println("工厂例子 结束");
    }

}
