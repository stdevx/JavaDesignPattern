package com.pattern.singleton.impl;

public class ShareData {

    public static volatile ShareData instance = null;

    public static ShareData getInstance() {
        if (instance == null) {
            synchronized (ShareData.class) {
                if (instance == null) {
                    instance = new ShareData();
                }
            }
        }
        return instance;
    }

    private ShareData() {
        System.out.println("construct ShareData");
    }
}
