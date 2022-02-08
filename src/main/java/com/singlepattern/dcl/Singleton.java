package com.singlepattern.dcl;

/**
 * @author zyk
 * @version 1.0
 * @fileName Singleton
 * @description :TODO
 * @date 2022/2/8 15:29
 */
public class Singleton {
    private volatile static Singleton singleton;
    private Singleton (){}
    public static Singleton getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
