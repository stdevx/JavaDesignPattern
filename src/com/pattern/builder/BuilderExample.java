package com.pattern.builder;

import com.pattern.builder.impl.Apple;
import com.pattern.builder.impl.Color;

public class BuilderExample {
    public void show() {
        System.out.println("建造器例子 开始");

        Apple.AppleBuilder builder = new Apple.AppleBuilder("GoodApple", Color.RED);
        builder.withSize(1);
        builder.withPrices(10);
        builder.withBrand("good");
        builder.withDate("2020-12-25");
        Apple apple = builder.build();
        System.out.println(apple);

        System.out.println("建造器例子 结束");
    }
}
