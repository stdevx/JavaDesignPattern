package com.pattern;

import com.pattern.adapter.AdapterExample;
import com.pattern.builder.BuilderExample;
import com.pattern.factory.FactoryExample;
import com.pattern.observer.ObserverExample;
import com.pattern.singleton.SingletonExample;
import com.pattern.visitor.VisitorExample;

public class Main {

    public static void main(String[] args) {
//        SingletonExample singletonExample = new SingletonExample();
//        singletonExample.show();
//        FactoryExample factoryExample = new FactoryExample();
//        factoryExample.show();
//        AdapterExample adapterExample = new AdapterExample();
//        adapterExample.show();
//        ObserverExample observerExample = new ObserverExample();
//        observerExample.show();
//        BuilderExample builderExample = new BuilderExample();
//        builderExample.show();
        VisitorExample visitorExample = new VisitorExample();
        visitorExample.show();
    }

}
