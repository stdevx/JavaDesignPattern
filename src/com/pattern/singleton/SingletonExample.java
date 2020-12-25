package com.pattern.singleton;

import com.pattern.singleton.impl.ShareData;

public class SingletonExample {
    public void show() {
        System.out.println("单例例子 开始");
        for (int i = 0; i < 3; i++) {
            new Thread(() -> {
                System.out.println("线程" + Thread.currentThread().getName() + "启动");
                ShareData shareData = ShareData.getInstance();
                System.out.println("shareData对象 " + shareData);
            }, "t" + i).start();
        }

        while (Thread.activeCount() > 2) {

        }
        System.out.println("单例例子 结束");
    }
}
