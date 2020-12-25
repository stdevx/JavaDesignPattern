package com.pattern.observer.impl;

public class Car implements TrafficLightObserver {

    @Override
    public void updated(LightColor lightColor) {
        System.out.println("汽车：" + lightColor.getValue());
    }
}
