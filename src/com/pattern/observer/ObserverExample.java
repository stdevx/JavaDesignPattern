package com.pattern.observer;

import com.pattern.observer.impl.Car;
import com.pattern.observer.impl.LightColor;
import com.pattern.observer.impl.Pedestrian;
import com.pattern.observer.impl.TrafficLight;

public class ObserverExample {
    public void show() {
        System.out.println("观察者例子 开始");

        TrafficLight trafficLight = new TrafficLight();
        trafficLight.addObserver(new Car());
        trafficLight.addObserver(new Pedestrian());
        trafficLight.timePass();
        trafficLight.timePass();
        trafficLight.timePass();
        trafficLight.timePass();

        System.out.println("观察者例子 结束");
    }
}
