package com.pattern.observer.impl;

public class Pedestrian implements TrafficLightObserver {

    @Override
    public void updated(LightColor lightColor) {
        System.out.println("行人：" + lightColor.getValue());
    }

}
