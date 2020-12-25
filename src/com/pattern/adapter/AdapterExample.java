package com.pattern.adapter;

import com.pattern.adapter.impl.AppleCakeAdapter;
import com.pattern.adapter.impl.Baker;

public class AdapterExample {
    public void show() {
        System.out.println("适配器例子 开始");

        Baker baker = new Baker(new AppleCakeAdapter());
        baker.getCake();

        System.out.println("适配器例子 结束");
    }
}
