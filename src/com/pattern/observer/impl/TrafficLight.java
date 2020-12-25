package com.pattern.observer.impl;

import java.util.ArrayList;
import java.util.List;

public class TrafficLight {

    private LightColor currentLightColor;
    private final List<TrafficLightObserver> observers;

    public TrafficLight() {
        observers = new ArrayList<>();
        currentLightColor = LightColor.RED;
    }

    public void addObserver(TrafficLightObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(TrafficLightObserver observer) {
        observers.remove(observer);
    }

    public void timePass() {
        LightColor[] ev = LightColor.values();
        currentLightColor = ev[(currentLightColor.ordinal() + 1) % ev.length];
        System.out.println("交通灯有变化: " + currentLightColor.getValue());
        notifyObservers();
    }

    private void notifyObservers() {
        for (TrafficLightObserver observer : observers) {
            observer.updated(currentLightColor);
        }
    }

}
