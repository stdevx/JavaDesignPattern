package com.pattern.proxy;

import com.pattern.proxy.impl.IvoryTower;
import com.pattern.proxy.impl.Wizard;
import com.pattern.proxy.impl.WizardTowerProxy;

public class ProxyExample {
    public void show() {
        WizardTowerProxy proxy = new WizardTowerProxy(new IvoryTower());
        proxy.enter(new Wizard("Gray"));
        proxy.enter(new Wizard("Blue"));
        proxy.enter(new Wizard("Yellow"));
        proxy.enter(new Wizard("Green"));
        proxy.enter(new Wizard("Brown"));
    }
}
